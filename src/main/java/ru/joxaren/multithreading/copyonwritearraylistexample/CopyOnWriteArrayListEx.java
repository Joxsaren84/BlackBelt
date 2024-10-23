package ru.joxaren.multithreading.copyonwritearraylistexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

        arrayList.add("Oleg");
        arrayList.add("Helga");
        arrayList.add("Ivan");
        arrayList.add("Margo");
        arrayList.add("Alex");

        System.out.println(arrayList);

        Runnable runnable1 = () -> {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                    System.out.println(iterator.next());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList.remove(4);
            arrayList.add("Egor");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(arrayList);

    }
}
