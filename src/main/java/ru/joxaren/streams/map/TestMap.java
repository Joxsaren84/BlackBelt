package ru.joxaren.streams.map;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("Bye");
        list1.add("How are you");
        list1.add("ok");

        List<Integer> list2 = list1.stream().map(element -> element.length()).toList();
        System.out.println(list2);

        int [] array = {1, 5, 3, 9, 5};
        array = Arrays.stream(array).map(operand -> {return operand % 3 == 0 ? operand / 3 : operand;}).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hi");
        set.add("Bye");
        set.add("How are you");
        set.add("ok");

        Set<Integer> set2 = set.stream().map(element-> element.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
