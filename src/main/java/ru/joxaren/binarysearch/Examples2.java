package ru.joxaren.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Examples2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(10, "Sergey", 40000);
        Employee emp2 = new Employee(20, "Egor", 41000);
        Employee emp3 = new Employee(40, "Ann", 50000);
        Employee emp4 = new Employee(30, "Margo", 30000);
        Employee emp5 = new Employee(80, "Peter", 40000);
        Employee emp6 = new Employee(60, "Ivan", 41000);
        Employee emp7 = new Employee(90, "John", 30000);
        Employee emp8 = new Employee(70, "Sergey", 40000);
        Employee emp9 = new Employee(30, "Another emp", 40000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println(Collections.binarySearch(employees, emp4));


    }
}
