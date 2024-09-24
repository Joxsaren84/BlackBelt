package ru.joxaren.multithreading.threadpoolexamples.scheduleexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AtFixedRateExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableClass(), 3, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
            scheduledExecutorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
