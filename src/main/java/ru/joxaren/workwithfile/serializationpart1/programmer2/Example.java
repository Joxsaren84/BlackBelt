package ru.joxaren.workwithfile.serializationpart1.programmer2;

import ru.joxaren.workwithfile.serializationpart1.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {

        Employee employee;

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("emp.bin"))){
            employee = (Employee)inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
