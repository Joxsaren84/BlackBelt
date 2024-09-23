package ru.joxaren.multithreading.threadpoolexamples.executorserviceexample;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " -starts");
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " -ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
