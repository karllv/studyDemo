package com.kk.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        /*ArrayList<ComparableDemo> objects = new ArrayList<>();
        for (int i = 6; i > 0; i--) {
            ComparableDemo comparableDemo = new ComparableDemo();
            comparableDemo.setAge(10 + i);
            objects.add(comparableDemo);
        }
        Collections.sort(objects);
        System.out.println("objects: " + objects);*/


        ArrayList<ComparatorDemo> objects2 = new ArrayList<>();
        for (int i = 6; i > 0; i--) {
            ComparatorDemo comparatorDemo = new ComparatorDemo();
            comparatorDemo.setAge(10 + i);
            objects2.add(comparatorDemo);
        }
       /* Collections.sort(objects2, new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        Collections.sort(objects2, Comparator.comparing(ComparatorDemo::getAge));
        System.out.println("objects: " + objects2);
    }
}
