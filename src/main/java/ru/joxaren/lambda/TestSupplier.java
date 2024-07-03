package ru.joxaren.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        ArrayList<Car> cars = createTreeCars(() -> new Car("Toyota Corolla", "white", 1.3));
        System.out.println("Our cars: " + cars);
    }

    public static ArrayList<Car> createTreeCars(Supplier<Car> supplier){
        ArrayList<Car> arrayList = new ArrayList<>();

        for (int i = 0; i <= 3; i++){
            arrayList.add(supplier.get());
        }

        return arrayList;
    }

}
