package ru.joxaren.map_interface;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap = new HashMap<>();

        //добавление
        myHashMap.put(100, "Egor");
        myHashMap.put(101, "Irina");
        myHashMap.put(102, "Gleb");

        System.out.println(myHashMap);

        //добаление с одинаковым ключем (замена)
        myHashMap.put(100, "Sam");
        System.out.println(myHashMap);

        //добавление с одинаковым значением, ключем null и значением null
        myHashMap.put(105, "Sam");
        myHashMap.put(null, "Sam");
        myHashMap.put(106, null);
        System.out.println(myHashMap);

        //добавить если нет такого ключа
        myHashMap.putIfAbsent(105, "Lin");
        myHashMap.putIfAbsent(103, "Lin");
        System.out.println(myHashMap);

        //get (получение по ключу)
        System.out.println(myHashMap.get(102));
        System.out.println(myHashMap.get(1000));

        //удаление (по значению ключа)
        myHashMap.remove(null);
        System.out.println(myHashMap);

        //содержит ли значение
        System.out.println(myHashMap.containsValue(null));
        System.out.println(myHashMap.containsValue("Ann"));

        //содержит ли ключ
        System.out.println(myHashMap.containsKey(null));
        System.out.println(myHashMap.containsKey(101));

        //получение множества ключей
        System.out.println(myHashMap.keySet());

        //получение множества значений
        System.out.println(myHashMap.values());


    }
}
