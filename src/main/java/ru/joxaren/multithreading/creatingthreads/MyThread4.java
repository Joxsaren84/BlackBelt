package ru.joxaren.multithreading.creatingthreads;

public class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--){
            System.out.println(i);
        }
    }
}
