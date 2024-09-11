package ru.joxaren.multithreading.lockexamples.example1;

public class Example1 {

    public static void main(String[] args) {
        Call call = new Call();

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.SkypeCall();
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.MobileCall();
            }
        });

        Thread thread3 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.TelegramCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
