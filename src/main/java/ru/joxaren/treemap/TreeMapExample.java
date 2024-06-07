package ru.joxaren.treemap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Double, Student> myTreemap = new TreeMap<>();

        Student st1 = new Student("Alex", "Normov", 2);
        Student st2 = new Student("Egor", "Ivanov", 1);
        Student st3 = new Student("Lisa", "Simpson", 3);
        Student st4 = new Student("Uma", "Vonhg", 2);
        Student st5 = new Student("Ghechtor", "Lee", 5);

        myTreemap.put(4.8, st1);
        myTreemap.put(5.0, st2);
        myTreemap.put(4.3, st3);
        myTreemap.put(3.1, st4);
        myTreemap.put(4.7, st5);

        System.out.println(myTreemap);

        //требуется имплиментировать интерфейс comparable и реализовать метод compareTo или использовать компоратор;
        TreeMap<Student, Double> myTreemap2 = new TreeMap<>((o1, o2) -> o1.name.compareTo(o2.name));

        myTreemap2.put(st1, 4.8);
        myTreemap2.put(st2, 5.0);
        myTreemap2.put(st3, 4.3);
        myTreemap2.put(st4, 3.1);
        myTreemap2.put(st5, 4.7);

        System.out.println(myTreemap2);

        //вывод по ключу
        System.out.println(myTreemap.get(4.8));

        //удаление
        myTreemap.remove(4.8);
        System.out.println(myTreemap);

        //разворот при выводе
        System.out.println(myTreemap.descendingMap());
        System.out.println(myTreemap);

        //Получение того, что больше ключа включая
        System.out.println(myTreemap.tailMap(4.3));

        //Получение того, что меньше ключа не включая
        System.out.println(myTreemap.headMap(4.3));

        //вывод самого большого элемента
        System.out.println(myTreemap.lastEntry());

        //вывод самого маленького элемента
        System.out.println(myTreemap.firstEntry());

    }





}
