package ru.joxaren.multithreading.lockexamples.example2;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread{

    private Lock lock;
    private String name;

    public Employee(Lock lock, String name) {
        this.lock = lock;
        this.name = name;
        this.start();
    }

    @Override
    public void run() {
        if(lock.tryLock()){
            try {
                System.out.println(name + " using the ATM.");
                Thread.sleep(2000);
                System.out.println(name + " finish using the ATM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }else{
            System.out.println(name + " don't want to wait.");
        }
    }
}
