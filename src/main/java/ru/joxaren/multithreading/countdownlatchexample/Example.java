package ru.joxaren.multithreading.countdownlatchexample;

import java.util.concurrent.CountDownLatch;

public class Example {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace(){
        try {
            Thread.sleep(2000);
            System.out.println("Market staff came to work!");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    private static void everythingIsReady(){
        try {
            Thread.sleep(4000);
            System.out.println("Everything is ready for open.");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    private static void openMarket(){
        try {
            Thread.sleep(4000);
            System.out.println("Market opened.");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    public static void main(String[] args) {

        new Friend("Egor", countDownLatch);
        new Friend("Sarah", countDownLatch);
        new Friend("Henry", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Lola", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }


}
