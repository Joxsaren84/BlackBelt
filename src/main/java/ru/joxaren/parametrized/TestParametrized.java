package ru.joxaren.parametrized;

import java.util.ArrayList;

public class TestParametrized {

    public static void main(String[] args) {

        ParametrizedClass1 <String> pr1 = new ParametrizedClass1<>("Something");
        System.out.println(pr1);

        ParametrizedClass1 <Integer> pr2 = new ParametrizedClass1<>(100500);
        System.out.println(pr2);

        ParametrizedClass2 <String, Integer> p1 = new ParametrizedClass2<>("Something", 100500);
        System.out.println(p1.getParameter1() + " " + p1.getParameter2());

        ParametrizedClass2 <Integer, String> p2 = new ParametrizedClass2<>(100500, "Something");
        System.out.println(p2.getParameter1() + " " + p2.getParameter2());

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        System.out.println(ClassWithParametrizedMethod.getTail(arrayList));

        ClassWithParametrizedMethod.showAll(arrayList);
    }

}
