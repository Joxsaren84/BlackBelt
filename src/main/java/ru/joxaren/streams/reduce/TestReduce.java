package ru.joxaren.streams.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestReduce {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);

        int multiple = list.stream().reduce((accumulator, element)-> accumulator*element).get();
        System.out.println(multiple);

        List<Integer> list2 = new ArrayList<>();

        Optional<Integer> o = list2.stream().reduce((accumulator, element)-> accumulator*element);

        if(o.isPresent())
            System.out.println(o.get());
        else
            System.out.println("Is empty");

        int multiple2 = list.stream().reduce(1, (accumulator, element)-> accumulator*element);
        System.out.println(multiple2);

        List<String> myList = new ArrayList<>();
        myList.add("Hi!");
        myList.add("Bye!");
        myList.add("How are you?");
        myList.add("Ok!");

        String concat = myList.stream().reduce((a, e)-> a + " " + e).get();
        System.out.println(concat);

    }


}
