package ru.joxaren.multithreading.sleepandjoin;

public class SleepAndJoin {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable1());
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        thread.join();
        System.out.println(thread.getState());
        System.out.println("main ends");
    }

}
