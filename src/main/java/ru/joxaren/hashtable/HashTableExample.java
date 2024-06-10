package ru.joxaren.hashtable;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<Double, Student> myHashTable = new Hashtable<>();

        Student st1 = new Student("Vasya", 3);
        Student st2 = new Student("Oksana", 1);
        Student st3 = new Student("Elena", 2);

        myHashTable.put(7.2, st1);
        myHashTable.put(8.2, st2);
        myHashTable.put(9.2, st3);

        System.out.println(myHashTable);

        /* Ключ и значения не могут быть null
        myHashTable.put(null, st2);
        myHashTable.put(9.2, null);
        */
    }

}
