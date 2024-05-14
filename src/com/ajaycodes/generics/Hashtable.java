package com.ajaycodes.generics;

import java.util.StringJoiner;

public class Hashtable <K,V>{
    private K k;

    public Hashtable(K k, V v) {
        this.k = k;
        this.v = v;
    }

    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hashtable.class.getSimpleName() + "[", "]")
                .add("k=" + k)
                .add("v=" + v)
                .toString();
    }
}
