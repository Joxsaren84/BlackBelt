package ru.joxaren.multithreading.daemonthreadexample;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        Thread thread1 = new UserThread();
        thread1.setName("User thread");

        Thread thread2 = new DaemonThread();
        thread2.setName("Daemon thread");
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        System.out.println("End of main");
    }
}
