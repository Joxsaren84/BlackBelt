package ru.joxaren.inner_class;

public class Test {

    public static void main(String[] args) {


        Car car = new Car("red", 2, 300);
        System.out.println(car);

        Car car1 = new Car("black", 4);
        car1.setEngine(car1.new Engine(200));
        System.out.println(car1);

    }
}
