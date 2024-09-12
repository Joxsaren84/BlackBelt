package ru.joxaren.multithreading.daemonthreadexample;

public class UserThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Name thread is " + Thread.currentThread().getName());
            System.out.println("Is daemon? " + Thread.currentThread().isDaemon());
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.println(i);
                sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
