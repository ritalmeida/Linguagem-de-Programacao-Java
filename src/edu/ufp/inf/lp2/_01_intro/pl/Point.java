package edu.ufp.inf.lp2._01_intro.pl;

public class Point {

  public float x;

  public float y;

  public Point(float x, float y) {

    this.x = x;
    this.y = y;
  }

  public void move(float deltaX, float deltaY) {

    /*this.x += deltaX;
    this.y += deltaY;*/
    moveX(deltaX);
    moveY(deltaY);
  }

  public float distanceX(Point p) {

    return this.x - p.x;
  }

  public float distanceY(Point p) {

    return this.y - p.y;
  }

  public float distance(Point p) {

    float dx = distanceX(p);
    float dy = distanceY(p);

    return (float) Math.sqrt((dx * dx) + (dy * dy));
  }

  public void moveX(float delta) {

    this.x += delta;
  }

  public void moveY(float delta) {

    this.y += delta;
  }

  public float getX() {

    return x;
  }

  public void setX(float x) {

    this.x = x;
  }

  public float getY() {

    return y;
  }

  public void setY(float y) {

    this.y = y;
  }
}