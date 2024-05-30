package ru.joxaren.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Masha");
        myArrayList.add("Petya");
        myArrayList.add("Vasya");
        myArrayList.add("Egor");
        myArrayList.add("Irina");

        Iterator<String> iterator = myArrayList.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
            iterator.remove();
        }

        System.out.println("\n" + myArrayList);
    }
}
