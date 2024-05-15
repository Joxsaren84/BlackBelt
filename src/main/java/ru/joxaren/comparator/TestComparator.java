package ru.joxaren.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {
        ArrayList <Employee> employeeArrayList = new ArrayList<>();

        Employee emp1 = new Employee(100, "Ivan", "Verin");
        Employee emp2 = new Employee(150, "Ivan", "Sidorov");
        Employee emp3 = new Employee(50, "Peter", "Rikov");

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);

        System.out.println("Before sort:");
        System.out.println(employeeArrayList);

        System.out.println("After sort for id:");
        Collections.sort(employeeArrayList);
        System.out.println(employeeArrayList);

        System.out.println("After sort for name:");
        Collections.sort(employeeArrayList, new FirstAndLastNameComporator());
        System.out.println(employeeArrayList);

        System.out.println("After sort for id with anonymous:");

        Comparator<Employee> idComporator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        };

        Collections.sort(employeeArrayList, idComporator);
        System.out.println(employeeArrayList);

        System.out.println("After sort for name with lambda:");

        //Comparator<Employee> byName = (e1, e2) ->  e1.firstName.compareTo(e2.firstName) == 0 ?  e1.lastName.compareTo(e2.lastName) : e1.firstName.compareTo(e2.firstName);

        Collections.sort(employeeArrayList, (e1, e2) ->  e1.firstName.compareTo(e2.firstName) == 0 ?  e1.lastName.compareTo(e2.lastName) : e1.firstName.compareTo(e2.firstName));
        System.out.println(employeeArrayList);
    }
}
