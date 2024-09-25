package ru.joxaren.multithreading.callableandfutureexamples;

import java.util.concurrent.Callable;

public class Factorial implements Callable <Integer> {

    int f;

    public Factorial(int f){
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if(f <=0){
            throw new Exception("This number is wrong");
        }
        int result = 1;

        for (int i = 1; i <= f; i++)
            result *= i;

        return result;
    }
}
