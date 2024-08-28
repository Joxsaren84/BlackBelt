package ru.joxaren.multithreading.volatileexample;

public class MyThread extends Thread{

    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. Counter is " + counter);
    }
}
