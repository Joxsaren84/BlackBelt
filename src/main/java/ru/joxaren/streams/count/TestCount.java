package ru.joxaren.streams.count;

import java.util.stream.Stream;

public class TestCount {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 3, 4, 2);

        //System.out.println(stream.count());
        System.out.println(stream.distinct().count());

    }
}
