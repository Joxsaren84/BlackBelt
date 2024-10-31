package ru.joxaren.workwithfile.serializationpart1.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

    public static void main(String[] args) {

        Employee employee = new Employee("Helga", 27, 1200, "HR", new Car("Toyota", "white", "V6"));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("emp.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
