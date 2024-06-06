package ru.joxaren.hashcode;

import java.util.Objects;

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
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, course);
    }
}
