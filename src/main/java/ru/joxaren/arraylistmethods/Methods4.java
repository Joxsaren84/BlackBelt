package ru.joxaren.arraylistmethods;


import java.util.ArrayList;
import java.util.List;

public class Methods4 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Masha");
        myArrayList.add("Petya");
        myArrayList.add("Vasya");
        myArrayList.add("Egor");
        myArrayList.add("Irina");

        System.out.println(myArrayList);

        List <String> list = myArrayList.subList(1, 3);
        System.out.println(list);

        list.add("Alex");
        System.out.println(myArrayList);
    }
}
