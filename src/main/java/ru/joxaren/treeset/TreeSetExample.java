package ru.joxaren.treeset;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(8);
        treeSet.add(12);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(9);

        //не содержит дубликатов
        treeSet.add(8);

        //не хранит null
        //treeSet.add(null);

        System.out.println(treeSet);

        treeSet.remove(8);

        System.out.println(treeSet);

        System.out.println(treeSet.contains(8));

    }

}
