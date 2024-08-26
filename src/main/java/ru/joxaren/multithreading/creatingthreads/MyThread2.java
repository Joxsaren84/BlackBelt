package ru.joxaren.multithreading.creatingthreads;

public class MyThread2 extends Thread{
 @Override
    public void run(){
        for (int i = 1000; i >= 1; i--){
            System.out.println(i);
        }
    }

}
