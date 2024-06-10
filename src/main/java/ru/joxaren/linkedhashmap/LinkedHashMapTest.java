package ru.joxaren.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        LinkedHashMap<Double, Student> myLinkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Vasya", 6);
        Student st2 = new Student("Oksana", 1);
        Student st3 = new Student("Elena", 2);
        Student st4 = new Student("Ruslan", 5);
        Student st5 = new Student("Egor", 4);


        myLinkedHashMap.put(7.2, st1);
        myLinkedHashMap.put(8.2, st2);
        myLinkedHashMap.put(6.2, st3);
        myLinkedHashMap.put(5.2, st4);
        myLinkedHashMap.put(9.2, st5);

        System.out.println(myLinkedHashMap);

        myLinkedHashMap.get(9.2);
        myLinkedHashMap.get(5.2);
        myLinkedHashMap.get(6.2);
        myLinkedHashMap.get(8.2);
        myLinkedHashMap.get(7.2);

        System.out.println(myLinkedHashMap);
    }
}
