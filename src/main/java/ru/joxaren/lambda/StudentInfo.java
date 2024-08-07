package ru.joxaren.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Lilit", 'f', 28, 2, 6.2);
        Student student3 = new Student("Igor", 'm', 21, 3, 5.3);
        Student student4 = new Student("Dina", 'f', 25, 3, 7);
        Student student5 = new Student("Ury", 'm', 18, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        //System.out.println(students);

        //Collections.sort(students, (st1, st2) -> st1.name.compareTo(st2.name));
        //System.out.println(students);

        StudentInfo info = new StudentInfo();


        //info.printStudentsOverGrade(students, 8);
        //System.out.println("-----------------------------------------------------------");
        //info.printStudentsAnderAge(students, 25);
        //System.out.println("-----------------------------------------------------------");
        //info.printStudentsMixCondition(students, 20, 9, 'f');

        //info.testStudents(students, student -> student.avgGrade > 8);
        //System.out.println("-----------------------------------------------------------");
        //info.testStudents(students, student -> student.age < 25);
        //System.out.println("-----------------------------------------------------------");
        //info.testStudents(students, student ->  student.age > 20 && student.avgGrade < 9 && student.sex == 'f');

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents(students, p1.and(p2));
        System.out.println("-----------------------------------------------------------");
        info.testStudents(students, p1.or(p2));
        System.out.println("-----------------------------------------------------------");
        info.testStudents(students, p1.and(p2).negate());

        System.out.println("Avg grade of all is: " + avgOfSmth(students, student -> student.avgGrade));
        System.out.println("Avg age of all is: " + avgOfSmth(students, student -> (double)student.age));
    }

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> condition) {
        for (Student s : arrayList) {
            if (condition.test(s)) {
                System.out.println(s);
            }
        }
    }

    static double avgOfSmth(ArrayList<Student> list, Function<Student , Double> function){
        double result = 0;
        for (Student student : list){
            result += function.apply(student);
        }
        return result /= list.size();
    }
}
/*
    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade){
        for (Student s : arrayList){
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsAnderAge(ArrayList<Student> arrayList, int age){
        for (Student s : arrayList){
            if (s.age < age){
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex){
        for (Student s : arrayList){
            if (s.age > age && s.avgGrade < grade && s.sex == sex){
                System.out.println(s);
            }
        }
    }*/
