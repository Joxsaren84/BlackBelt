package ru.joxaren.lambda;

public class Test {

    static void def(I i){
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        def(str -> str.length());
    }
}

interface I {
    int abc(String s);
}
