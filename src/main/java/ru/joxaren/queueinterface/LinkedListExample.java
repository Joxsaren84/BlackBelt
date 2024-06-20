package ru.joxaren.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        //добавляет в конец очереди, выбрасывает exception при переполнении
        queue.add("Maksim");
        queue.add("Piter");
        queue.add("Henry");
        queue.add("Ann");
        queue.add("Mary");

        //добавляет в конец очереди, не выбрасывает exception при переполнении просто не обавляет
        queue.offer("Ivan");

        System.out.println(queue);

        //удаляет первый элемент выбрасывает exception при отсутствии элементов в очереди
        System.out.println(queue.remove());
        System.out.println(queue);

        //удаляет первый элемент не выбрасывает exception при отсутствии элементов в очереди, просто возвращает null
        System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        System.out.println(queue);

        //возвращает первый элемент в очереди, при отсутствии выбросит исключение
        System.out.println(queue.element());

        //возвращает первый элемент в очереди, при отсутствии вернет null
        System.out.println(queue.peek());


    }
}
