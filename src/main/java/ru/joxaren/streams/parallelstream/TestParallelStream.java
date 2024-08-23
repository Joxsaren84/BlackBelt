package ru.joxaren.streams.parallelstream;

import java.util.ArrayList;
import java.util.List;

public class TestParallelStream {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(5d);
        list.add(1d);
        list.add(0.25);


        Double sum = list.parallelStream().reduce((a, e) -> a + e).get();
        System.out.println(sum);

        Double dif = list.stream().reduce((a, e) -> a / e).get();
        System.out.println(dif);

        Double difP = list.parallelStream().reduce((a, e) -> a / e).get();
        System.out.println(difP);

    }

}
