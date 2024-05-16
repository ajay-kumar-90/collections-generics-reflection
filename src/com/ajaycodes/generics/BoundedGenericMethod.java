package com.ajaycodes.generics;

public class BoundedGenericMethod {
    <T extends Number> double calculateSum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2)<0) {
            return num1;
        }
        return num2;
    }
}
