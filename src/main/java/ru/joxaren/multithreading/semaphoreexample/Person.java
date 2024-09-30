package ru.joxaren.multithreading.semaphoreexample;

import java.util.concurrent.Semaphore;

public class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        super(name);
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting...");
            callBox.acquire();
            System.out.println(name + " is making a call.");
            sleep(200);
            System.out.println(name + " is finishing.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}
