package com.ajaycodes.generics;

import java.util.ArrayList;
import java.util.List;

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

        BoundedGenericMethod boundedGenericMethod = new BoundedGenericMethod();
        boundedGenericMethod.calculateSum(2 , 5.0);

        System.out.println(boundedGenericMethod.calculateMin("Ajay", "Sangeetha"));
        System.out.println("Min Aged Person's age : " + boundedGenericMethod.calculateMin(new Person(20, "Ajay"),
                new Person(35,
                "Vijay")));
        addStore(1, new ArrayList<>());
        addStore("Ajay", new ArrayList<>());

        // type witness
        Demo.<String>addStore("Ajay", new ArrayList<>());

        getData("Hello World", new ArrayList<>());

        System.out.println("Item added : " + add(new ArrayList<>(), 1, 2));
        System.out.println("Item Added: "+ add(new ArrayList<>(), "Ajay", "Sangeetha"));

    }

    // list of Buckets
    static <T> void addStore(T t, List<Bucket<T>> buckets) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        buckets.add(bucket);
        // item added in bucket successfully
        System.out.println("Item " + bucket.getItem() + " added successfully in list " + bucket);
    }

    static <T> T getData(T t1, T t2) {
        return t1;
    }

    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

}
