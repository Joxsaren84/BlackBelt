package ru.joxaren.streams.forEach;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestForEach {
    public static void main(String[] args) {
        Integer [] array = {5, 2, 8 , 12, 9};

        Arrays.stream(array).forEach(element->{element += 5;
            System.out.println(element);});

        Arrays.stream(array).forEach(System.out::println);

        Stream<Integer> myStream = Stream.of(2, 4, 8, 6, 32, 64);

        myStream.forEach(System.out::println);
    }
}
