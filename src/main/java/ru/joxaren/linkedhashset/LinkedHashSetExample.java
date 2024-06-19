package ru.joxaren.linkedhashset;

import java.util.LinkedHashSet;
public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet=  new LinkedHashSet<>();

        linkedHashSet.add(5);
        linkedHashSet.add(8);
        linkedHashSet.add(12);
        linkedHashSet.add(35);
        linkedHashSet.add(11);
        linkedHashSet.add(16);

        //запоминает последовательность добавления элементов
        System.out.println(linkedHashSet);

        linkedHashSet.remove(12);
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.contains(12));


    }

}
