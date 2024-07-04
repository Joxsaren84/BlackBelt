package ru.joxaren.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List <String> list = List.of("privet", "kak dela", "normalno", "poka");
        list.forEach(str -> System.out.println(str));

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        arrayList.forEach(integer -> {
            System.out.println(integer);
            integer *= 2;
            System.out.println(integer);
        });

    }

}
