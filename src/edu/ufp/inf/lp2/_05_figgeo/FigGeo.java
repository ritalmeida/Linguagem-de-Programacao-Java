package edu.ufp.inf.lp2._05_figgeo;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class FigGeo implements FigGeoDimsI, FigGeoDrawI, FigGeoRelsI, Serializable {

  private Color color;

  public ArrayList<Point>  points = new ArrayList<>();

  public FigGeo(Color color) {

    this.color = color;
  }

  public FigGeo(){

    this.points = new ArrayList<>();
  }

  public Point getPoint(int index) {

    return this.points.get(index);
  }

  public void addPoint(Point x) {

    for (Point p : this.points){

      if (p.equals(x)){

        return;
      }
      this.points.add(x);
    }
  }

  public void setColor(java.awt.Color color) {

    this.color = color;
  }

  public ArrayList<Point> getPoints() {

    return points;
  }

  @Override
  public double area() {

    return 0;
  }

  @Override
  public double perimeter() {

    return 0;
  }

  @Override
  public void draw(Graphics g) {

  }

  @Override
  public boolean isInside(FigGeo f) {

    return false;
  }

  @Override
  public boolean isInterceptedBy(FigGeo f) {

    return false;
  }

  protected boolean containsPoint(Point edge) {

    return false;
  }
}