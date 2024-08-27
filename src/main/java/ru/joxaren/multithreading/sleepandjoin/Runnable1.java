package ru.joxaren.multithreading.sleepandjoin;

public class Runnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Working begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("working ends");
    }
}
