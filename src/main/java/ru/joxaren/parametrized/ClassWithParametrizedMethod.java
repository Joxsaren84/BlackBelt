package ru.joxaren.parametrized;

import java.util.ArrayList;

public class ClassWithParametrizedMethod {

    static <T> T getTail(ArrayList<T> arrayList){
        return arrayList.get(arrayList.size() - 1);
    }

    static <T> void showAll(ArrayList<T> arrayList){
        for(T t : arrayList){
            System.out.println(t);
        }
    }
}
