package ru.joxaren.multithreading.lockexamples.example2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Employee e1 = new Employee(lock, "Egor");
        Employee e2 = new Employee(lock, "Mary");
        Employee e3 = new Employee(lock, "Mark");
    }

}
