package ru.joxaren.multithreading.synchronizedexample;

public class TestSynchronized {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(MyClass.counter);
    }

}
