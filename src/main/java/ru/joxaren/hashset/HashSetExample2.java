package ru.joxaren.hashset;

import java.util.HashSet;

public class HashSetExample2 {

    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(5);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(1);
        myHashSet.add(8);

        HashSet<Integer> myHashSet2 = new HashSet<>();

        myHashSet2.add(7);
        myHashSet2.add(4);
        myHashSet2.add(3);
        myHashSet2.add(5);
        myHashSet2.add(8);

        //объединение
        HashSet<Integer> union = new HashSet<>(myHashSet);
        union.addAll(myHashSet2);

        System.out.println(union);

        //пересечение
        HashSet<Integer> intersect = new HashSet<>(myHashSet);
        intersect.retainAll(myHashSet2);

        System.out.println(intersect);

        //разность
        HashSet<Integer> subtract = new HashSet<>(myHashSet);
        subtract.removeAll(myHashSet2);

        System.out.println(subtract);
    }

}
