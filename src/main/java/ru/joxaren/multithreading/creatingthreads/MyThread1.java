package ru.joxaren.multithreading.creatingthreads;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++){
            System.out.println(i);
        }
    }
}
