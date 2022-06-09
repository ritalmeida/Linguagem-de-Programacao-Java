package edu.ufp.inf.lp2._01_intro.tp;

import edu.ufp.inf.lp2._01_intro.pl.Rectangle;

import java.util.ArrayList;

public class MyArrayListsDemo {

    public static void main(String[] args) {

        testRawArrayList();
        testGenerifiedArrayList();
    }

    public static void testGenerifiedArrayList(){

        //ArrayList of any type Raw objects
        ArrayList<String> arrList2 = new ArrayList<>();
        //arrList2.add("World");
        //arrList2.add("Hello");
        //arrList2.add("Another");
        System.out.println("" + arrList2.size());
        //arrList2.add(new Point());
        //arrList2.add(new Rectangle());

        String s1 = arrList2.get(0);
        //Point p1 = (Point) arrList2.get(1);
        //Rectangle r1 = (Rectangle) arrList2.get(2);

        for (Object o : arrList2){

            System.out.println("arrList2(" + arrList2.indexOf(o) + ") = " + o.toString());
        }

        String s2 = arrList2.remove(1);
        arrList2.remove(s1);

        for (Object o : arrList2){

            System.out.println("arrList2(" + arrList2.indexOf(o) + ") = " + o.toString());
        }
    }

    public static void testRawArrayList(){

        //ArrayList pf any type Raw objects
        ArrayList arrList1 = new ArrayList();
        arrList1.add("Hello");
        arrList1.add(new Point());
        arrList1.add(new Rectangle());

        String s1 = (String) arrList1.get(0);
        Point p1 =(Point) arrList1.get(1);
        Rectangle r1 = (Rectangle) arrList1.get(2);

        for (Object o : arrList1){

            System.out.println("arrList1(" + arrList1.indexOf(o) + ") = " + o);
        }
    }

}