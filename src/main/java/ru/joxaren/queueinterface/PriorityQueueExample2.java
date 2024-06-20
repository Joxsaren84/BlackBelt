package ru.joxaren.queueinterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {

    public static void main(String[] args) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.name.compareTo(st2.name);
            }
        });

        Student st1 = new Student("Artem", 5);
        Student st2 = new Student("Lily", 3);
        Student st3 = new Student("Ann", 1);
        Student st4 = new Student("Egor", 2);
        Student st5 = new Student("Vera", 4);

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());



        System.out.println(priorityQueue);

    }

}
