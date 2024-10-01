package ru.joxaren.multithreading.countdownlatchexample;

import java.util.concurrent.CountDownLatch;

public class Friend extends Thread{

    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
