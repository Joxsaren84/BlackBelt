package ru.joxaren.hashset;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Oleg");
        myHashSet.add("Margo");
        myHashSet.add("Egor");
        myHashSet.add("Egor");
        myHashSet.add(null);

        System.out.println(myHashSet);

        myHashSet.remove("Oleg");
        System.out.println(myHashSet);

        System.out.println(myHashSet.size());

        System.out.println(myHashSet.isEmpty());

        System.out.println(myHashSet.contains("Egor"));





    }
}
