package edu.ufp.inf.lp2._01_intro.tp;

import edu.ufp.inf.lp2._01_intro.pl.Rectangle;

public class MyArrayDemo {

    public static void main(String[] args) {

        //testArrayPrimitives();
        testArrayObjects();
    }

    public static void testArrayPrimitives(){

        //Array of primitive types
        int[] arrInt = new int[3];
        float[] arrFloat = new float[2];

        for (int i = 0; i < arrInt.length; i++){

            System.out.println("arrInt[" + i + "] = " + arrInt[i]);
        }

        int i = 0;
        for (float f : arrFloat){

            System.out.println("arrFloat[" + i++ + ") = " + f);
        }

    }

    public static void testArrayObjects(){

        //Arrays of Class types, i.e., arrays of objects
        Point[] arrPoints = new Point[3];
        Rectangle[] arrRectangles = new Rectangle[2];

        for (int i = 0; i < arrPoints.length; i++){

            arrPoints[i] = new Point();
            System.out.println("arrPoints[" + i + "] = " + arrPoints[i]);
        }

        /*for (int i = 0; i < arrRectangles.length; i++){

            arrRectangles[i] = new Rectangle();
            System.out.println("arrRectangles[" + i + "] = " + arrRectangles[i].toString());
        }*/

        int i = 0;

        for (Rectangle r : arrRectangles){

            System.out.println("arrRectangles[" + i++ + "] = " + r.toString());
        }
    }

}
