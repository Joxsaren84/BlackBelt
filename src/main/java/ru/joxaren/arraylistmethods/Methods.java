package ru.joxaren.arraylistmethods;

import java.util.ArrayList;

public class Methods {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();

        //add
        myArrayList.add("Masha");
        myArrayList.add("Petya");
        myArrayList.add("Vasya");

        //add with index
        myArrayList.add(1, "Egor");


        //get(index)
        for (int i = 0; i < myArrayList.size(); i++){
            System.out.print(myArrayList.get(i) + " ");
        }

        System.out.println();

        //set(index)
        myArrayList.set(1, "Igor");

        for (String s : myArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //remove(index)
        myArrayList.remove(3);

        for (String s : myArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //remove(Object) сравнение equals
        myArrayList.remove("Petya");

        for (String s : myArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //addAll
        ArrayList<String> list = new ArrayList<>();

        list.add("Petya");
        list.add("Vasya");

        myArrayList.addAll(list);

        for (String s : myArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //addAll with index
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Egor");
        list1.add("Alex");

        myArrayList.addAll(2, list1);

        for (String s : myArrayList) {
            System.out.print(s + " ");
        }

        System.out.println();

        //clear
        list1.clear();
        System.out.println(list1);

        //indexOf(Object) сравнение equals первое вхождение
        System.out.println(myArrayList.indexOf("Egor"));
        System.out.println(myArrayList.indexOf("Doonya"));

        //LastIndexOf(Object) сравнение equals последнее вхождение
        myArrayList.add("Egor");
        System.out.println(myArrayList.lastIndexOf("Egor"));

        //size
        System.out.println(myArrayList.size());

        //isEmpty
        System.out.println(myArrayList.isEmpty());
        System.out.println(list1.isEmpty());

        //contains(Object) сравнение equals
        System.out.println(myArrayList.contains("Egor"));
        System.out.println(myArrayList.contains("Doonya"));
    }
}
