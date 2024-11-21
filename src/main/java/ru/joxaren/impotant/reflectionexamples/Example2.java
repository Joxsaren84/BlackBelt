package ru.joxaren.impotant.reflectionexamples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employee = Class.forName("ru.joxaren.impotant.reflectionexamples.Employee");

        /*
        Employee e = (Employee) employee.newInstance();
        System.out.println(e);


        Constructor constructor1 = employee.getConstructor();
        Employee e = (Employee) constructor1.newInstance();
        System.out.println(e);
        */
        Constructor<Employee> constructor1 = employee.getConstructor();
        Employee e = constructor1.newInstance();
        System.out.println(e);

        Constructor constructor2 = employee.getDeclaredConstructor(int.class, String.class, String.class);
        Object o = constructor2.newInstance(5, "Vasya", "HR");
        System.out.println(o);

        Method method = employee.getMethod("setSalary", double.class);
        method.invoke(o, 800.80);
        System.out.println(o);



    }
}
