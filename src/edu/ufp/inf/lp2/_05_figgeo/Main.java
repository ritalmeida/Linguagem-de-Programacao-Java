/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2._05_figgeo;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /*Rectangle r1 = new Rectangle(new Point(0, 10), new Point(10, 0), null);
        Rectangle r2 = new Rectangle(new Point(1, 4), new Point(4, 1), null);

        Rectangle rectInside = new Rectangle(new Point(2, 8), new Point(8, 2), null);
        Rectangle rectIntercept = new Rectangle(new Point(-1, 2), new Point(4, -2), null);
        Rectangle rectOutside = new Rectangle(new Point(11, 10), new Point(15, 0), null);
        System.out.println("Dimensions 'r1'");
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println();

        System.out.println("Dimensions 'r2'");
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println();

        System.out.println("Relation between 'r1' and 'rectInside'");
        System.out.println(getResult(r1, rectInside));
        System.out.println(getResult(rectInside, r1));
        System.out.println();

        System.out.println("Relation between 'r1' and 'rectIntercept'");
        System.out.println(getResult(r1, rectIntercept));
        System.out.println(getResult(rectIntercept, r1));
        System.out.println();

        System.out.println("Relation between 'r1' and 'rectOutside'");
        System.out.println(getResult(r1, rectOutside));
        System.out.println(getResult(rectOutside, r1));
        System.out.println();

        Circle c1 = new Circle(new Point(2, 4), 5, null);
        Circle c2 = new Circle(new Point(3, 5), 1, null);
        Circle c3 = new Circle(new Point(8, 4), 2, null);

        System.out.println("Dimensions 'c1'");
        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println();

        System.out.println("Dimensions 'c2'");
        System.out.println("Area: " + c2.area());
        System.out.println("Perimeter: " + c2.perimeter());
        System.out.println();

        System.out.println("Relation between 'c1' and 'c2'");
        System.out.println(getResult(c1, c2));
        System.out.println(getResult(c2, c1));
        System.out.println();

        System.out.println("Relation between 'c1' and 'c3'");
        System.out.println(getResult(c1, c3));
        System.out.println(getResult(c3, c1));
        System.out.println();

        System.out.println("Relation between 'r1' and 'c1'");
        System.out.println(getResult(r1,c1));
        System.out.println();

        System.out.println("Relation between 'r1' and 'c2'");
        System.out.println(getResult(r1,c2));
        System.out.println();

        System.out.println("Relation between 'r2' and 'c1'");
        System.out.println(getResult(r2,c1));
        System.out.println();

        Triangle t1 = new Triangle(new Point(2,7), new Point(-3,0), new Point(7,0), null);
        System.out.println("Dimensions 't1'");
        System.out.println("Area: " + t1.area());
        System.out.println("Perimeter: " + t1.perimeter());
        System.out.println();

        System.out.println("Relation between 'r1' and 't1'");
        System.out.println(getResult(r1,t1));
        System.out.println();

        System.out.println("Relation between 'r2' and 't1'");
        System.out.println(getResult(r2,t1));

        //OUTPUT
        /*
        Dimensions 'r1'
        Area: 100.0
        Perimeter: 40.0

        Dimensions 'r2'
        Area: 9.0
        Perimeter: 12.0

        Relation between 'r1' and 'rectInside'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is not intercepted by Retangle@{Point@{2.0, 8.0}, Point@{8.0, 2.0}}
        Retangle@{Point@{2.0, 8.0}, Point@{8.0, 2.0}} is inside and is not intercepted by Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}}

        Relation between 'r1' and 'rectIntercept'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is intercepted by Retangle@{Point@{-1.0, 2.0}, Point@{4.0, -2.0}}
        Retangle@{Point@{-1.0, 2.0}, Point@{4.0, -2.0}} is not inside and is intercepted by Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}}

        Relation between 'r1' and 'rectOutside'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is not intercepted by Retangle@{Point@{11.0, 10.0}, Point@{15.0, 0.0}}
        Retangle@{Point@{11.0, 10.0}, Point@{15.0, 0.0}} is not inside and is not intercepted by Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}}

        Dimensions 'c1'
        Area: 78.53981633974483
        Perimeter: 31.41592653589793

        Dimensions 'c2'
        Area: 3.141592653589793
        Perimeter: 6.283185307179586

        Relation between 'c1' and 'c2'
        Circle@{Point@{2.0, 4.0}, radius: 5.0} is not inside and is not intercepted by Circle@{Point@{3.0, 5.0}, radius: 1.0}
        Circle@{Point@{3.0, 5.0}, radius: 1.0} is inside and is not intercepted by Circle@{Point@{2.0, 4.0}, radius: 5.0}

        Relation between 'c1' and 'c3'
        Circle@{Point@{2.0, 4.0}, radius: 5.0} is not inside and is intercepted by Circle@{Point@{8.0, 4.0}, radius: 2.0}
        Circle@{Point@{8.0, 4.0}, radius: 2.0} is not inside and is intercepted by Circle@{Point@{2.0, 4.0}, radius: 5.0}

        Relation between 'r1' and 'c1'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is intercepted by Circle@{Point@{2.0, 4.0}, radius: 5.0}

        Relation between 'r1' and 'c2'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is not intercepted by Circle@{Point@{3.0, 5.0}, radius: 1.0}

        Relation between 'r2' and 'c1'
        Retangle@{Point@{1.0, 4.0}, Point@{4.0, 1.0}} is inside and is not intercepted by Circle@{Point@{2.0, 4.0}, radius: 5.0}

        Dimensions 't1'
        Area: 35.0
        Perimeter: 27.204650534085253

        Relation between 'r1' and 't1'
        Retangle@{Point@{0.0, 10.0}, Point@{10.0, 0.0}} is not inside and is intercepted by Triangle@{Point@{2.0, 7.0}, Point@{-3.0, 0.0}, Point@{-3.0, 0.0}}

        Relation between 'r2' and 't1'
        Retangle@{Point@{1.0, 4.0}, Point@{4.0, 1.0}} is inside and is not intercepted by Triangle@{Point@{2.0, 7.0}, Point@{-3.0, 0.0}, Point@{-3.0, 0.0}}
        */
    }

    private static String getResult(FigGeo fig1, FigGeo fig2) {

        StringBuilder sb = new StringBuilder();
        sb.append(fig1);
        sb.append(fig1.isInside(fig2) ? " is" : " is not");
        sb.append(" inside and ");
        sb.append(fig1.isInterceptedBy(fig2) ? "is" : "is not");
        sb.append(" intercepted by ");
        sb.append(fig2);
        return sb.toString();
    }
}
