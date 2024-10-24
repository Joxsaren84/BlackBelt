package ru.joxaren.multithreading.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Example {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
            int i = 0;

            while(true){
                try {
                    queue.put(++i);
                    System.out.println("Producer add " + i + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }).start();

        //Consumer
        new Thread(() -> {

            while(true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer remove " + j + " " + queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }).start();
    }

}
