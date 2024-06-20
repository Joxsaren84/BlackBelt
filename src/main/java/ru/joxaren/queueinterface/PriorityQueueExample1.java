package ru.joxaren.queueinterface;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(12);
        priorityQueue.add(2);
        priorityQueue.add(10);

        System.out.println(priorityQueue);

        //приоритет по озрастанию
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());

    }

}
