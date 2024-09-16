package ru.joxaren.multithreading.interruptexample;

public class InterruptedClass extends Thread{

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 10000000; i++){
            if(isInterrupted()){
                System.out.println("Thread get interrupt. Finish thread.");
                System.out.println(sqrtSum);
                return;
            } else {
                sqrtSum += Math.sqrt(i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread get interrupt when it sleeping. Finish thread.");
                    System.out.println(sqrtSum);
                    return;
                }
            }
        }
        System.out.println(sqrtSum);
    }
}
