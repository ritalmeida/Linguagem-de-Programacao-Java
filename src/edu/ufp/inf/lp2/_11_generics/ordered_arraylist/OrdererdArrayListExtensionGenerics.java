package edu.ufp.inf.lp2._11_generics.ordered_arraylist;

import java.util.ArrayList;

public class OrdererdArrayListExtensionGenerics<T extends Comparable<T>> extends ArrayList<T> {

    public OrdererdArrayListExtensionGenerics() {

        super();
    }

    public OrdererdArrayListExtensionGenerics(int dia) {

        super(dia);
    }

    @Override
    public boolean add(T t) {

        if (this.isEmpty()) {
            super.add(t);
            return true;
        }
        int size = super.size();
        for (int i = 0; i < size; i++) {

            T ti = super.get(i);
            if (ti.compareTo(t) > 0) {

                super.add(i, t);
                return true;
            }
            else if(ti.compareTo(t) == 0) {

                return false;
            }
        }
        return super.add(t);
    }

    public boolean remove (T t) {

        int s = super.size();
        for (int i = 0; i < s; i++) {

            T ti = super.get(i);
            if (ti.compareTo(t) == 0) {
                return super.remove(t);
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {

        return (index >= 0 && index < super.size() ? super.remove(index) : null);
    }

    public static void main(String[] args) {

        OrdererdArrayListExtensionGenerics<String> ordererdArrayListExtensionGenerics = new OrdererdArrayListExtensionGenerics<>();
        ordererdArrayListExtensionGenerics.add("xpto");
        ordererdArrayListExtensionGenerics.add("ola");
        ordererdArrayListExtensionGenerics.add("alo");

        System.out.println(ordererdArrayListExtensionGenerics);
        System.out.println(ordererdArrayListExtensionGenerics.remove("ola"));
        System.out.println(ordererdArrayListExtensionGenerics);

    }
}
