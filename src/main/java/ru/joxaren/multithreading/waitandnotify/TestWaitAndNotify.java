package ru.joxaren.multithreading.waitandnotify;

public class TestWaitAndNotify {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread2.start();
        thread1.start();

    }
}
