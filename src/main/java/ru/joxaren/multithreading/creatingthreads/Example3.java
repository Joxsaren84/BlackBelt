package ru.joxaren.multithreading.creatingthreads;

public class Example3 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++){
                    System.out.println(i);
                }
            }
        }).start();

        new Thread(()->{
                for (int i = 100; i >= 1; i--){
                System.out.println(i);
            }
        }).start();
    }
}
