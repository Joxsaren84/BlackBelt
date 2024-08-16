package ru.joxaren.streams.chaining;

import ru.joxaren.streams.sorted.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestChaining {

    public static void main(String[] args) {

        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e->e%2==1).map(operand -> {return operand % 3 ==0 ? operand / 3 : operand;})
                .reduce((a, e)-> a + e).getAsInt();
        System.out.println(result);


        List<Student> list = new ArrayList<>();

        Student st1 = new Student("Alex", 'm', 23, 4, 4.5);
        Student st2 = new Student("Gerta", 'f', 19, 1, 5);
        Student st3 = new Student("George", 'm', 21, 2, 3.9);
        Student st4 = new Student("Junior", 'm', 20, 1, 4);
        Student st5 = new Student("Lola", 'f', 22, 3, 4.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        list.stream().map(e -> {e.setName(e.getName().toUpperCase()); return e;})
                .filter(e->e.getSex() == 'f').sorted((s1, s2) -> s1.getAge()-s2.getAge())
                .forEach(e-> System.out.println(e));
    }

}
