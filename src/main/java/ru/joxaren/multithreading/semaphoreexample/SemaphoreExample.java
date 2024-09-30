package ru.joxaren.multithreading.semaphoreexample;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Sarah", callBox);
        new Person("Alex", callBox);
        new Person("Henry", callBox);
        new Person("Magna", callBox);
        new Person("Peter", callBox);

    }

}
