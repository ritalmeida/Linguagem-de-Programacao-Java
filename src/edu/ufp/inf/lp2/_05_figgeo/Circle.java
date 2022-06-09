package edu.ufp.inf.lp2._05_figgeo;

import java.awt.*;

public class Circle extends FigGeo implements Comparable {

  public double radius;
  public Point center;

  public Circle(Point p, double radius) {

    super();
    this.addPoint(p);
    this.radius = radius;
  }

  public Circle(Color color, double radius, Point center) {

    super(color);
    this.radius = radius;
    this.addPoint(center);
  }

  public Point getCenter() {

    return center;
  }

  @Override
  public boolean isInside(FigGeo f) {

    if (f instanceof Circle){

      Point myCenter = this.points.get(0);
      Point fCenter = f.points.get(0);
      return myCenter.dist(fCenter) >= radius;
    }

    /*Point p = this.getPoint(0);

    double r1 = radius;
    double r2 = this.radius;

    return false;*/
  return false;
  }

  @Override
  public boolean isInterceptedBy(FigGeo f) {

    center = this.getPoint(0);
    Point edge = new Point(center.getX()+radius, center.getY()+radius);

    if(f instanceof Circle) {
      return f.containsPoint(edge);
    }

    return false;
  }

  @Override
  public boolean containsPoint(Point p) {

    Point myCenter = this.points.get(0);

    return Math.pow(p.x-myCenter.x,2)+Math.pow(p.y-myCenter.y,2) <= Math.pow(radius,2);
  }

  @Override
  public double area() {

    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double perimeter() {

    return 2 * Math.PI * radius;
  }

  public double getRadius() {

    return radius;
  }

  public void setRadius(double radius) {

    this.radius = radius;
  }

  public String toString() {

    return "Circle{ " + "r: " + radius + "c: " + center + "}";
  }

  /*@Override
  public int compareTo(Circle circle) {

    if (this.area() > circle.area()){
      return 1;
    }
    if (this.area() == circle.area()){
      return 0;
    }
    return -1;
  }*/

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}