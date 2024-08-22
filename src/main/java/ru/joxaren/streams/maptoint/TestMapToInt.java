package ru.joxaren.streams.maptoint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapToInt {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hi");
        list.add("Good day");
        list.add("Bye");
        list.add("Good bye");

        List<Integer> list2 = list.stream().mapToInt(e->e.length()).boxed().collect(Collectors.toList());
        System.out.println(list2);

        int sum = list.stream().mapToInt(e->e.length()).sum();
        System.out.println(sum);

        double avg = list.stream().mapToInt(e->e.length()).average().getAsDouble();
        System.out.println(avg);

        int min = list.stream().mapToInt(e->e.length()).min().getAsInt();
        System.out.println(min);

        int max = list.stream().mapToInt(value -> value.length()).max().getAsInt();
        System.out.println(max);

    }

}
