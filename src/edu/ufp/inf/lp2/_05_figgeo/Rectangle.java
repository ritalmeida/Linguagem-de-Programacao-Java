package edu.ufp.inf.lp2._05_figgeo;

import java.awt.*;

public class Rectangle extends FigGeo implements Comparable{

  public Rectangle(Point lup, Point rdp, Color color) {

  }

  public Rectangle(Point lup, Point rdp) {

    super();
    addPoint(lup);
    addPoint(rdp);
  }

  @Override
  public boolean isInside(FigGeo f) {

    Point lup = this.getPoint(0);
    Point rdp = this.getPoint(1);
    if(f instanceof Rectangle) {
      return f.containsPoint(lup) && f.containsPoint(rdp);
    }
    return false;
  }

  @Override
  public boolean isInterceptedBy(FigGeo f) {

    if (f instanceof  Rectangle){

      Point lup = this.getPoint(0);
      Point rdp = points.get(1);
      /*Point ldp = new Point(lup.getX(), rdp.getY());
      Point rup = new Point(rdp.getX(), lup.getY());*/
      Point f_lup = points.get(0);
      Point f_rdp = points.get(1);
      Point f_dirsup = new Point(f_rdp.x, f_lup.y);
      Point f_esqinf = new Point(f_lup.x, f_rdp.y);

      boolean b1 = this.containsPoint(f_lup) || this.containsPoint(f_rdp);
      boolean b2 = this.containsPoint(f_dirsup) || this.containsPoint(f_esqinf);

      return b1 && b2;

      //return f.containsPoint(ldp) || f.containsPoint(rup) || f.containsPoint(rdp) || f.containsPoint(lup);
    }

    return false;
  }

  @Override
  public boolean containsPoint(Point p) {

    Point lup = points.get(0);
    Point rdp = this.getPoint(1);   // os métodos são iguais
    return p.xBetweenPoints(lup, rdp) && p.yBetweenPoints(lup, rdp);
  }

  @Override
  public double area() {

    Point lup = points.get(0);   //ir buscar os pontos ao array list
    Point rdp = points.get(1);
    double dx = lup.distX(rdp);
    double dy = lup.distY(rdp);

    return dx * dy;
  }

  @Override
  public double perimeter() {

    Point lup = points.get(0);
    Point rdp = points.get(1);
    double dx = lup.distX(rdp);
    double dy = lup.distY(rdp);

    return (2*dx) + (2*dy);
  }

  @Override
  public void addPoint(Point p){

    if (this.points.size() > 2){

      return;
    }
    super.addPoint(p);
  }

  public String toString() {

    Point lup = this.getPoint(0);
    Point rdp = this.getPoint(1);
    return "Rectangle{ " + lup + ", " + rdp + "}";
  }

  /*@Override
  public int compareTo(Rectangle rectangle) {

      if (this.area() > rectangle.area()){
        return 1;
      }
      if (this.area() == rectangle.area()){
        return 0;
      }
      return -1;
  }*/

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}