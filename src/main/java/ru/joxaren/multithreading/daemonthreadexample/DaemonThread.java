package ru.joxaren.multithreading.daemonthreadexample;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Name thread is " + Thread.currentThread().getName());
            System.out.println("Is daemon? " + Thread.currentThread().isDaemon());
            for (int i = 0; i <= 100; i++){
                System.out.println(i);
                sleep(50);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
