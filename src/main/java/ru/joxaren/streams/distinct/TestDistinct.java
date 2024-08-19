package ru.joxaren.streams.distinct;

import java.util.stream.Stream;

public class TestDistinct {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 1, 2, 2, 3, 4, 4, 3, 5, 6, 5, 6);
        stream1.distinct().forEach(System.out::println);

        Stream<String> stream2 = Stream.of("Hi", "Ok", "How are you?", "Hi");
        stream2.distinct().forEach(System.out::println);


    }

}
