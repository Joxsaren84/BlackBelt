package ru.joxaren.multithreading.volatileexample;

public class VolatileExample {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it's time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of program.");
    }
}
