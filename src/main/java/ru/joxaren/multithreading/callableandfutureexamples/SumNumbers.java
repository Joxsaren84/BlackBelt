package ru.joxaren.multithreading.callableandfutureexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {

    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> list = new ArrayList<>();

        Long longValueDividedBy10 = value / 10;

        for (int i = 0; i < 10; i++){
            long from = longValueDividedBy10 * i + 1;
            long to = longValueDividedBy10 * (i + 1);

            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            list.add(futurePartSum);
        }

        for (Future<Long> future : list){
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executorService.shutdown();
        System.out.println("Total sum is: " + sum);
    }

}
