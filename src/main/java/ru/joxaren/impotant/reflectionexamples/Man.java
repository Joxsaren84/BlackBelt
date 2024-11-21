package ru.joxaren.impotant.reflectionexamples;

public class Man {

    String name;
    String surname;

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
