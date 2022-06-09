package edu.ufp.inf.lp2._11_generics.intro_box;

public class BoxGeneric<T> {

    private T t;

    public <U extends Number> void inspect(U u) {

        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {

        //BoxGeneric<Integer> integerBoxGeneric = new BoxGeneric<>(10);
    }
}
