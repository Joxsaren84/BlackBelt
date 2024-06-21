package ru.joxaren.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        //добавление в начало и конец с выбросом сключения при переполнении
        deque.addFirst(5);
        deque.addLast(3);

        //добавление в начало и конец при условии не переполненого дека без выброса исключения
        deque.offerFirst(2);
        deque.addLast(1);

        System.out.println(deque);

        //удаление с начала и конца с выбросом сключения при отсутствии элементов
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        //удаление с начала и конца c возвратом null в случае пустого дека
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        //получение первого и последнего элемента и null в случае пустого дека
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        //получение первого и последнего элемента и исключения в случае пустого дека
        deque.add(5);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

    }

}
