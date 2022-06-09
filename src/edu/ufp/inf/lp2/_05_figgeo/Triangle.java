package edu.ufp.inf.lp2._05_figgeo;

import java.awt.*;

public class Triangle extends FigGeo implements Comparable{

  public Triangle(Color color, Point pup, Point pLeft, Point pRight) {

    super(color);
    this.addPoint(pRight);
    this.addPoint(pLeft);
    this.addPoint(pup);
  }

  @Override
  public boolean isInside(FigGeo f) {

    return false;
  }

  @Override
  public boolean isInterceptedBy(FigGeo f) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsPoint(Point p) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public double area() {

    Point pup = this.getPoint(0);
    Point pLeft = this.getPoint(1);
    Point pRight = this.getPoint(2);

    //area = Xpup(YpLeft-YpRight) + XpLeft(YpRight-Ypup) + XpRight(Ypup-YpLeft) / 2

    return (double) Math.abs(((pup.getX()*(pLeft.getY()-pRight.getY())) +
            (pLeft.getX()*(pRight.getY()-pup.getY())) +
            (pRight.getX()*(pup.getY()-pLeft.getY())))/2);
  }

  @Override
  public double perimeter() {

    Point pup = this.getPoint(0);
    Point pLeft = this.getPoint(1);
    Point pRight = this.getPoint(2);

		/*double ax = Math.abs(pLeft.distanceX(pup));
		double ay = Math.abs(pLeft.distanceY(pup));
		double bx = Math.abs(pLeft.distanceX(pRight));
		double by = Math.abs(pLeft.distanceY(pRight));
		double cx = Math.abs(pRight.distanceX(pup));
		double cy = Math.abs(pRight.distanceY(pup));*/

    //formula distancia = sqrt((x2-x1)^2 + (y2-y1)^2)

    double a = Math.sqrt(Math.pow((pup.getX()-pLeft.getX()), 2) +
            Math.pow(pup.getY()-pLeft.getY(), 2));
    double b = Math.sqrt(Math.pow((pLeft.getX()-pRight.getX()), 2) +
            Math.pow(pLeft.getY()-pRight.getY(), 2));
    double c = Math.sqrt(Math.pow((pup.getX()-pRight.getX()), 2) +
            Math.pow(pup.getY()-pRight.getY(), 2));

    return (double) (a + b + c);
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  /*@Override
  public int compareTo(Triangle triangle) {

    if (this.area() > triangle.area()){
      return 1;
    }
    if (this.area() == triangle.area()){
      return 0;
    }
    return -1;
  }*/

}