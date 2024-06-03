package ru.joxaren.binarysearch;

public class Employee implements Comparable <Employee>{

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        return result != 0 ? result : this.name.compareTo(employee.name);
    }
}
