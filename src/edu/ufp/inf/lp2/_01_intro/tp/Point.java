package edu.ufp.inf.lp2._01_intro.tp;

public class Point {

    private float x;

    private float y;

    public Point(float x, float y) {

        this.x = x;
        this.y = y;
    }

    public Point() {
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
}