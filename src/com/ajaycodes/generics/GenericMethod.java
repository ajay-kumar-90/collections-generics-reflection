package com.ajaycodes.generics;

public class GenericMethod {

    public <T> T showItem(T t) {
        System.out.println("The item is : " + t.toString());
        return t;
    }

    public <K, V> void printItems(K k, V v) {
        System.out.println(k.toString() + v.toString());
    }

    public <T> void showItems(T[] ts) {
        for (T t : ts) {
            System.out.println(t);
        }
    }
}

