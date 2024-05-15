package ru.joxaren.comparable;

public class Employee implements Comparable<Employee>{

    int id;
    String firstName;
    String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /*
    @Override
    public int compareTo(Employee employee) { //classic id sort
        if(this.id == employee.id) {
            return 0;
        } else if(this.id > employee.id) {
            return 1;
        }else {
            return -1;
        }
    }

    @Override //id sort
    public int compareTo(Employee employee) {
        return this.id - employee.id;
    }*/

    @Override //name & last name sort
    public int compareTo(Employee employee) {
        int res = this.firstName.compareTo(employee.firstName);

        if(res == 0){
            res = this.lastName.compareTo(employee.lastName);
        }

        return res;
    }
}
