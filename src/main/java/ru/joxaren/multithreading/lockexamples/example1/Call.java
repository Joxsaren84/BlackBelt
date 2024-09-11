package ru.joxaren.multithreading.lockexamples.example1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {
    private Lock lock = new ReentrantLock();

    void MobileCall(){
        lock.lock();

        try {
            System.out.println("Mobile call starts.");
            Thread.sleep(5000);
            System.out.println("Mobile call ends.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

    void SkypeCall(){
        lock.lock();

        try {
            System.out.println("Skype call starts.");
            Thread.sleep(5000);
            System.out.println("Skype call ends.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

    void TelegramCall(){
        lock.lock();

        try {
            System.out.println("Telegram call starts.");
            Thread.sleep(5000);
            System.out.println("Telegram call ends.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

}
