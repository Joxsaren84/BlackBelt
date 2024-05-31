package ru.joxaren.linkedlist;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        Student st1 = new Student("Vasya", 3);
        Student st2 = new Student("Oksana", 1);
        Student st3 = new Student("Elena", 2);
        Student st4 = new Student("Ruslan", 5);
        Student st5 = new Student("Egor", 4);

        LinkedList <Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);


        System.out.println(linkedList);
        System.out.println(linkedList.get(3));

        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.add(0, st4);
        System.out.println(linkedList);
    }

}
