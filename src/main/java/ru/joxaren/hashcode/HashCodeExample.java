package ru.joxaren.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {

    public static void main(String[] args) {

        HashMap<Student, Double> myHashMap = new HashMap<>();

        Student st1 = new Student("Alex", "Normov", 2);
        Student st2 = new Student("Egor", "Ivanov", 1);
        Student st3 = new Student("Lisa", "Simpson", 3);
        Student st4 = new Student("Uma", "Vonhg", 2);
        Student st5 = new Student("Ghechtor", "Lee", 5);

        myHashMap.put(st1, 4.8);
        myHashMap.put(st2, 5.0);
        myHashMap.put(st3, 4.3);
        myHashMap.put(st4, 3.1);
        myHashMap.put(st5, 4.7);

        System.out.println(myHashMap);

        //ключ желательно делать final так как после изменения хэш объекта меняется,
        // а в мапе остается старый и элемент невозможно найти по ключу.
        st4.course = 5;
        System.out.println(myHashMap);
        System.out.println(myHashMap.containsKey(st4));

        //Сравнение сначала по hasCode потом по equals
        System.out.println(myHashMap.containsKey(new Student("Alex", "Normov", 2)));

        System.out.println(new Student("Alex", "Normov", 2).hashCode());
        System.out.println(st1.hashCode());

        for(Map.Entry<Student, Double> entry : myHashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
