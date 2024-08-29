package ru.joxaren.multithreading.synchronizedexample;

public class MyClass {

    static int counter;

    static synchronized void  increment(){
        counter++;
    }

}
