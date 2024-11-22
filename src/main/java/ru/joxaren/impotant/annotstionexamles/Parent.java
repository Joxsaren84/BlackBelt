package ru.joxaren.impotant.annotstionexamles;

public class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
    }
    @Deprecated
    void showInfo(){
        System.out.println("This is Parent class. Name = " + name);
    }
}
