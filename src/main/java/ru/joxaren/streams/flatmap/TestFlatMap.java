package ru.joxaren.streams.flatmap;

import java.util.ArrayList;
import java.util.List;

public class TestFlatMap {

    public static void main(String[] args) {

        Student st1 = new Student("Alex", 'm', 23, 4, 4.5);
        Student st2 = new Student("Gerta", 'f', 19, 1, 5);
        Student st3 = new Student("George", 'm', 21, 2, 3.9);
        Student st4 = new Student("Junior", 'm', 20, 1, 4);
        Student st5 = new Student("Lola", 'f', 22, 3, 4.1);

        Faculty f1 = new Faculty("economics");
        Faculty f2 = new Faculty("History");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();

        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(student -> System.out.println(student.getName()));
    }

}
