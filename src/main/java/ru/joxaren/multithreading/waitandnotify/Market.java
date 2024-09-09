package ru.joxaren.multithreading.waitandnotify;

public class Market {

    private int breadCount = 0;

    public synchronized void getBread(){
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Хлеба осталось " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на витрину 1 хлеб");
        System.out.println("Количество хлеба " + breadCount);
        notify();
    }
}
