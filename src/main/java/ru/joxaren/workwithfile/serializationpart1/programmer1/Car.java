package ru.joxaren.workwithfile.serializationpart1.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    static final long serialVersionUID = 1;
    String name;
    String color;
    String engine;

    public Car(String name, String color, String engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
