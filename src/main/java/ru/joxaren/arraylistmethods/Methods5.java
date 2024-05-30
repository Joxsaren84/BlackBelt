package ru.joxaren.arraylistmethods;

import java.util.ArrayList;
import java.util.List;

public class Methods5 {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Masha");
        myArrayList.add("Petya");
        myArrayList.add("Vasya");
        myArrayList.add("Egor");
        myArrayList.add("Irina");

        Object [] array = myArrayList.toArray();

        String [] array2 = myArrayList.toArray(new String[0]);

        for (String s : array2){
            System.out.print(s + " ");
        }
        System.out.println();


        //List.of (не могут содержать null и неизменяемые)
        List<String> list1 = List.of("s1", "s2", "s3");
        System.out.println(list1);

        List<String> list2 = List.copyOf(myArrayList);
        System.out.println(list2);
    }
}
