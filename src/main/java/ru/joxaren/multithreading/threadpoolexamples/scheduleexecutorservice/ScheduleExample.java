package ru.joxaren.multithreading.threadpoolexamples.scheduleexecutorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        scheduledExecutorService.schedule(new RunnableClass(), 3, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }

}
