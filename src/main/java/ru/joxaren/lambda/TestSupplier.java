package ru.joxaren.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class TestSupplier {

    public static void main(String[] args) {
        ArrayList<Car> cars = createTreeCars(() -> new Car("Toyota Corolla", "white", 1.3));
        System.out.println("Our cars: " + cars);

        changeCar(cars.get(0), car -> {
            car.color = "Yellow";
            car.engine = 2.0;
            System.out.println("upgraded car " + car);
        });
    }

    public static void changeCar(Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }

    public static ArrayList<Car> createTreeCars(Supplier<Car> supplier){
        ArrayList<Car> arrayList = new ArrayList<>();

        for (int i = 0; i <= 3; i++){
            arrayList.add(supplier.get());
        }

        return arrayList;
    }

}
