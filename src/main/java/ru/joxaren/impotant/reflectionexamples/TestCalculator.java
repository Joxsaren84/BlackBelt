package ru.joxaren.impotant.reflectionexamples;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))) {
            String m = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();
            System.out.println(m);

            Calculator calculator = new Calculator();
            Class calculatorClass = calculator.getClass();

            Method method = null;

            Method[] methods = calculatorClass.getDeclaredMethods();
            for (Method met : methods) {
                if (met.getName().equals(m)) {
                    method = met;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
