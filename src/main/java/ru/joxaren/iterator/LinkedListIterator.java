package ru.joxaren.iterator;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

    public static void main(String[] args) {
        String string = "madam";

        LinkedList <Character> myList = new LinkedList<>();

        for (Character ch : string.toCharArray()) {
           myList.add(ch);
        }

        ListIterator <Character> iterator = myList.listIterator();
        ListIterator <Character> revers = myList.listIterator(myList.size());

        boolean isPalindrome = true;

        while (iterator.hasNext() && revers.hasPrevious()){
            if (iterator.next() != revers.previous()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome  ? "Palindrome" : "Not palindrome");
    }
}
