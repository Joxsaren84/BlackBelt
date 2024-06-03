package ru.joxaren.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Examples {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(6);
        arrayList.add(55);
        arrayList.add(-12);
        arrayList.add(34);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 34));
        //revers
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //shuffle
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
