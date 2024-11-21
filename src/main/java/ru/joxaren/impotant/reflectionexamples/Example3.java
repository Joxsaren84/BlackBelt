package ru.joxaren.impotant.reflectionexamples;

import java.lang.reflect.Field;

public class Example3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Vasya", "HR");
        Class employeeClass = employee.getClass();
        Field someField = employeeClass.getDeclaredField("someField");
        someField.setAccessible(true);
        double d = (double)someField.get(employee);
        System.out.println(d);
    }

}
