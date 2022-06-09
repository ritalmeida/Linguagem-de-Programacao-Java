package edu.ufp.inf.lp2._01_intro.tp;

public class MyInstanceofDemo {

    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        System.out.println("a1.a = " + a1.a);
        System.out.println("b1.a = " + b1.a + " and b1.b = " + b1.b);
        System.out.println("c1.a = " + c1.a + " and c1.c = " + c1.c);

        //Generate random number between [0...1]
        double rand = Math.random();

        //Set instantiateBorC to B or C, based on the rand number
        String intantiateBorC = (rand > 0.5 ? "B" : "C");

        switch (intantiateBorC){

            case "B": //now a1 will reference/point to an object B
                a1 = new B();
                break;
            case "C": //now a1 will reference/point to an object C
                a1 = new C();
                break;
        }

        //System.out.println("a1.a = " + a1.a + ", a1.? = " + ((B)a1).b);
        //System.out.println("a1.a = " + a1.a + ", a1.? = " + ((C)a1).c);

        if (a1 instanceof B){

            System.out.println("a1.b = " + ((B) a1).b);
        }

        if (a1 instanceof C){

            //wrong cast causes ClassCastException
            System.out.println("a1.c = " + ((C) a1).c);
        }

    }

}


class A{
    int a;
}

class B extends A{

    //int a;
    int b;
}

class C extends A{

    int c;
}