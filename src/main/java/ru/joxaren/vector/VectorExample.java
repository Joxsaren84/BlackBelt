package ru.joxaren.vector;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> myVector = new Vector<>();

        myVector.add("Sharic");
        myVector.add("Musia");
        myVector.add("Barsic");
        myVector.add("Tomas");

        System.out.println(myVector);
        System.out.println(myVector.firstElement());
        System.out.println(myVector.lastElement());
        System.out.println(myVector.get(2));

        myVector.remove(3);
        System.out.println(myVector);
    }
}
