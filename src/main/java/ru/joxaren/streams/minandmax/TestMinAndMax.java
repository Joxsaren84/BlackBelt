package ru.joxaren.streams.minandmax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMinAndMax {

    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();

        Pet pet1 = new Pet("Sharik", 3);
        Pet pet2 = new Pet("Murka", 1);
        Pet pet3 = new Pet("Tuz", 2);
        Pet pet4 = new Pet("Yoko", 3);
        Pet pet5 = new Pet("Musia", 5);

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);

        Comparator <Pet> comparator = (p1, p2) -> p1.getAge() - p2.getAge();

        Pet min = pets.stream().min(comparator).get();
        Pet max = pets.stream().max(comparator).get();

        System.out.println(min);
        System.out.println(max);

    }

}
