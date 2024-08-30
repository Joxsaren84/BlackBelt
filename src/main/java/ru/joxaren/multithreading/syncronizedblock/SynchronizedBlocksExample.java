package ru.joxaren.multithreading.syncronizedblock;

public class SynchronizedBlocksExample {

    public static void main(String[] args) {

        new Thread(() -> new CallDevice().mobileCall()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new CallDevice().skypeCall();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new CallDevice().whatsappCall();
            }
        }).start();
    }


}
