package ru.joxaren.multithreading.creatingthreads;

public class Example1 {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();
    }
}
