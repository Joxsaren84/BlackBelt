package ru.joxaren.multithreading.atomicintegerexample;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment(){
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.get());

    }
}
