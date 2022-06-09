package edu.ufp.inf.lp2._01_intro.pl;

public class Rectangle {

  public Point upLeftPoint;

  public Point downRightPoint;

  public Rectangle(Point upLeftPoint, Point downRightPoint) {

    this.upLeftPoint = upLeftPoint;
    this.downRightPoint = downRightPoint;
  }

    public Rectangle() {

    }

    public float area() {

    float distanceY = this.upLeftPoint.distanceY(downRightPoint);
    float distanceX = this.upLeftPoint.distanceX(downRightPoint);

    return Math.abs(distanceX*distanceY);
  }

  public float perimeter() {

    float distanceY = Math.abs(this.upLeftPoint.distanceY(downRightPoint));
    float distanceX = Math.abs(this.upLeftPoint.distanceX(downRightPoint));

    return 2*distanceX + 2*distanceY;
  }

  public float diagonal() {

    return upLeftPoint.distance(downRightPoint);
  }

  public boolean isPointInside(Point p) {

    if (upLeftPoint.x >= p.x && downRightPoint.x <= p.x){

      if (upLeftPoint.y <= p.y && downRightPoint.y >= p.y){

        return true;
      }
    }

    return false;
  }

  public Point getUpLeftPoint() {

    return upLeftPoint;
  }

  public void setUpLeftPoint(Point upLeftPoint) {

    this.upLeftPoint = upLeftPoint;
  }

  public Point getDownRightPoint() {

    return downRightPoint;
  }

  public void setDownRightPoint(Point downRightPoint) {

    this.downRightPoint = downRightPoint;
  }
}