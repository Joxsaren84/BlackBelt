package ru.joxaren.streams.peek;

import java.util.stream.Stream;

public class TestPeek {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Hi", "Hello", "Good day", "Hi", "Hello");

        System.out.println(stream.distinct().peek(System.out::println).count());

    }
}
