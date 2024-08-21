package ru.joxaren.streams.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollect {

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

        Map<Integer, List<Student>> map = list.stream().map(e->{e.setName(e.getName().toUpperCase()); return e;})
                .collect(Collectors.groupingBy(e->e.getCourse()));

        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<Boolean, List<Student>> map1 = list.stream().collect(Collectors.partitioningBy(student -> student.getAvgGrate()>4));

        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
