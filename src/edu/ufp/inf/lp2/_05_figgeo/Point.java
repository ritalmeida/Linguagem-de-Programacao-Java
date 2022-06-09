package edu.ufp.inf.lp2._05_figgeo;

import java.util.ArrayList;
import java.util.List;

public class Point {

  public float x;

  public float y;

  public Point(float x, float y) {

    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public Point(double v, double v1) {
  }

  public void move(float dx, float dy) {

    this.x += dx;
    this.y += dy;
  }

  public float distX(Point p) {

    return this.x - p.x;
  }

  public float distY(Point p) {

    return this.y - p.y;
  }

  public float dist(Point p) {

    float dx = distX(p);
    float dy = distY(p);

    return (float) Math.sqrt((dx * dx) + (dy * dy));
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

  public static void main(String[] args) {

    Point p1 = new Point(0.0f, 0.0f);
    Point p2 = new Point(2.0f, 0.0f);

    System.out.println("P1 distX P2 = " + p1.distX(p2));
    System.out.println("P2 distX P1 = " + p2.distX(p1));

    System.out.println("\nP1 distY P2 = " + p1.distY(p2));
    System.out.println("P2 distY P1 = " + p2.distY(p1));

    System.out.println("\nP1 dist P2 = " + p1.dist(p2));

    p2.move(-1.0f, 1.0f);
    System.out.println("\nP1 dist P2 after move point = " + p1.dist(p2));
  }

  /**
   * verifica se o valor de x do ponto (this) está entre o leftPt e o rightPt
   * @param leftPt ponto a esquerda
   * @param rightPt ponto a direita
   * @return true se o valor do x do ponto estiver entreo o leftPt e o rightPt; false caso contrário
   */
  public boolean xBetweenPoints(Point leftPt, Point rightPt) {

    return (this.x > leftPt.x && this.x < rightPt.x);
  }

  /**
   * verifica se o valor de y do ponto (thist) está entre o upPt e o downPt
   * @param upPt
   * @param downPt
   * @return
   */
  public boolean yBetweenPoints(Point upPt, Point downPt) {

    return (this.y < upPt.y && this.y > downPt.y);
  }

  public void moveX(float delta) {

    this.x += delta;
  }

  public void moveY(float delta) {

    this.y += delta;
  }

}