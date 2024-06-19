package ru.joxaren.treeset;

import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student("Helga", 5);
        Student student2 = new Student("Egor", 3);
        Student student3 = new Student("Robert", 1);
        Student student4 = new Student("Ivan", 4);
        Student student5 = new Student("Roman", 2);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student student6 = new Student("Jack", 3);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.tailSet(student6));

        Student student7 = new Student("Mary", 5);
        System.out.println(treeSet.subSet(student6, student7));

        System.out.println(student7.equals(student1));
        System.out.println(student1.hashCode() == student7.hashCode());

    }

}
