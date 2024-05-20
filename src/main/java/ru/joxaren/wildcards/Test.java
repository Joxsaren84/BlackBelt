package ru.joxaren.wildcards;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(50);
        intList.add(12);

        ArrayList <Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(3.15);
        doubleList.add(3.17);

        showSumm(intList);
        showSumm(doubleList);

        ArrayList <String> stringArrayList = new ArrayList<>();
        //showSumm(stringArrayList);
    }

    public static void showSumm(ArrayList<? extends Number> arrayList){
        double summ = 0;
        for(Number n : arrayList){
            summ += n.doubleValue();
        }
        System.out.println(summ);
    }
}
