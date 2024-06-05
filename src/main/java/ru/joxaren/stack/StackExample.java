package ru.joxaren.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Alex");

        //push & add
        System.out.println(myStack.push("Egor"));
        System.out.println(myStack.add("Roman"));
        System.out.println(myStack);

        //peek and pop
        System.out.println(myStack.peek());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);

        //isEmpty
        myStack.add("Roman");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
            System.out.println(myStack);
        }
    }



}
