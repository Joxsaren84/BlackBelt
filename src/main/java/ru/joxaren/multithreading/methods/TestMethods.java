package ru.joxaren.multithreading.methods;

public class TestMethods {
    public static void main(String[] args) {

        MyThead thead1 = new MyThead();
        System.out.println("Thread1 name - " + thead1.getName());
        System.out.println("Thread1 priority - " + thead1.getPriority());

        MyThead thead2 = new MyThead();

        thead2.setName("MyThread");
        thead2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread2 name - " + thead2.getName());
        System.out.println("Thread2 priority - " + thead2.getPriority());

    }
}
