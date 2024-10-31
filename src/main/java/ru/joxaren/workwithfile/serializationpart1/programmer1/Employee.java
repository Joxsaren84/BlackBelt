package ru.joxaren.workwithfile.serializationpart1.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    String name;
    transient int age;
    double salary;
    String department;

    Car car;

    public Employee(String name, int age, double salary, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", car=" + car +
                '}';
    }
}
