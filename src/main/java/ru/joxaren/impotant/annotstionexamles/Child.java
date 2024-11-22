package ru.joxaren.impotant.annotstionexamles;

public class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("This is Child class. Name = " + name);
    }
}
