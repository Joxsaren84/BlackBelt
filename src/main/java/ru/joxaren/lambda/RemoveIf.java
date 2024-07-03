package ru.joxaren.lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Uchim Java");
        arrayList.add("A imenno Lambdas");

        arrayList.removeIf(string -> string.length() < 5);
        System.out.println(arrayList);
    }
}
