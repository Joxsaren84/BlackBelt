package ru.joxaren.arraylistmethods;

import java.util.Arrays;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");

        StringBuilder [] array = {sb1, sb2, sb3, sb4, sb5};

        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[3].append("o");
        System.out.println(list);
    }
}
