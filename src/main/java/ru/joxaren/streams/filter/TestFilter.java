package ru.joxaren.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student st1 = new Student("Alex", 'm', 23, 4, 4.5);
        Student st2 = new Student("Gerta", 'f', 19, 1, 5);
        Student st3 = new Student("George", 'm', 21, 2, 3.9);
        Student st4 = new Student("Junior", 'm', 20, 1, 4);
        Student st5 = new Student("Lola", 'f', 22, 3, 4.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        list = list.stream().filter(student -> student.getAge() >= 20 && student.getAvgGrate() >= 4).collect(Collectors.toList());

        System.out.println(list);

    }

}
