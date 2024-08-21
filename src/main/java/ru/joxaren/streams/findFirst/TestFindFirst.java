package ru.joxaren.streams.findFirst;

import java.util.ArrayList;
import java.util.List;

public class TestFindFirst {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hi");
        list.add("Hello");
        list.add("Good day");
        list.add("howdy");

        String word = list.stream().filter(e->e.length() > 2).findFirst().get();

        System.out.println(word);

    }

}
