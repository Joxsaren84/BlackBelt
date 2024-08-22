package ru.joxaren.streams.limit;

import java.util.ArrayList;
import java.util.List;

public class TestLimit {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hi");
        list.add("Good day");
        list.add("Bye");
        list.add("Good bye");

        list.stream().filter(e->e.length()>2).limit(2).forEach(System.out::println);
    }

}
