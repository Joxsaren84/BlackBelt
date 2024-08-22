package ru.joxaren.streams.skip;

import java.util.ArrayList;
import java.util.List;

public class TestSkip {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hi");
        list.add("Good day");
        list.add("Bye");
        list.add("Good bye");


        list.stream().filter(e->e.length()>3).skip(2).forEach(System.out::println);
    }


}
