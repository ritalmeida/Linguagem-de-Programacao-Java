package edu.ufp.inf.lp2._11_generics.intro_box;

/**
 * This class may store any object inside. The methods of this class accept or return an Object,
 * so we may pass whatever object, provided that it is not a primitive type.
 *
 * However, there is no way to verify, at compile time, how the class will be used.
 *
 * @author rui
 */
public class BoxObject {

    private Object object;

    public BoxObject(Object object) {

        this.object=object;
    }

    public void set(Object object) {

        this.object = object;
    }
    public Object get() {

        return object;
    }

    public static void main(String[] args) {

        BoxObject bo = new BoxObject("Hello");

        String s = (String) bo.get();
    }
}