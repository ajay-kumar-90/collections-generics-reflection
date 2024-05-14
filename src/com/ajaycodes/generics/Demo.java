package com.ajaycodes.generics;

public class Demo {
    public static void main(String[] args) {
        Store<String> stringStore = new Store<>();
        stringStore.setT("Ajay");
        System.out.println(stringStore.getT());

        Store<Integer> integerStore = new Store<>();
        integerStore.setT(1);
        System.out.println(integerStore.getT());

        Hashtable<String, Integer> hashtable = new Hashtable<>("Ajay", 100);
        System.out.println(hashtable);

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem(123);
        genericMethod.showItem("Ajay");
    }

}
