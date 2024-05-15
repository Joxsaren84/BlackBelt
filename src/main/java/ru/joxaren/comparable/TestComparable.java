package ru.joxaren.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    public static void main(String[] args) {
        ArrayList <Employee> employeeArrayList = new ArrayList<>();

        Employee emp1 = new Employee(150, "Ivan", "Verin");
        Employee emp2 = new Employee(100, "Ivan", "Sidorov");
        Employee emp3 = new Employee(200, "Peter", "Rikov");

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);

        System.out.println("Before sort:");
        System.out.println(employeeArrayList);

        System.out.println("After sort:");
        Collections.sort(employeeArrayList);
        System.out.println(employeeArrayList);
    }

}
