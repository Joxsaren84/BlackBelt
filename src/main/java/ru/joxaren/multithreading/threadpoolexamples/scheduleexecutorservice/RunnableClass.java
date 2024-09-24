package ru.joxaren.multithreading.threadpoolexamples.scheduleexecutorservice;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is started");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is ended");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
