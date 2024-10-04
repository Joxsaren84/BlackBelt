package ru.joxaren.multithreading.atomicintegerexample;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100; i++){
            AtomicIntegerExample.increment();
        }
    }
}
