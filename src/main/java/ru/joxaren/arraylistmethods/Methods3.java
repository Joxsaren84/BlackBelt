package ru.joxaren.arraylistmethods;

import java.util.ArrayList;

public class Methods3 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList1 = new ArrayList<>();
        myArrayList1.add("Masha");
        myArrayList1.add("Petya");
        myArrayList1.add("Vasya");
        myArrayList1.add("Egor");

        ArrayList<String> myArrayList2 = new ArrayList<>();
        myArrayList2.add("Masha");
        myArrayList2.add("Petya");

        //removeAll
        System.out.println(myArrayList1);
        myArrayList1.removeAll(myArrayList2);
        System.out.println(myArrayList1);

        //retainAll
        myArrayList1.add("Masha");
        myArrayList1.add("Petya");
        System.out.println(myArrayList1);
        myArrayList1.retainAll(myArrayList2);
        System.out.println(myArrayList1);

        //containsAll
        System.out.println(myArrayList1.containsAll(myArrayList2));

        //
    }
}
