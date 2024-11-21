package ru.joxaren.impotant.reflectionexamples;

public class Calculator {

    void sum(int a, int b){
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    void multiplication(int a, int b){
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    void difference(int a, int b){
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    void division(int a, int b){
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }

}
