package ru.joxaren.treemap;

public class Student {

    String name;
    String lastName;
    int course;

    public Student(String name, String lastName, int course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
