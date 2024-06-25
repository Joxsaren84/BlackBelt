package ru.joxaren.static_nested_class;

public class Test {

    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(210);
        System.out.println(engine);

        Car car = new Car("Red", 5, engine);
        System.out.println(car);

        //System.out.println(Car.Engine.counterOfEngines);
        car.showCountOfEngines(engine);

    }

}
