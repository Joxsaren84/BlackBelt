package ru.joxaren.multithreading.interruptexample;

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main started");

        Thread thread = new InterruptedClass();
        thread.start();
        thread.sleep(2000);

        thread.interrupt();


        thread.join();
        System.out.println("main finished");
    }


}
