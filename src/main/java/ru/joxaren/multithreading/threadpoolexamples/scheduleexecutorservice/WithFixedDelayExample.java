package ru.joxaren.multithreading.threadpoolexamples.scheduleexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WithFixedDelayExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableClass(), 2, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(50000);
            scheduledExecutorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
