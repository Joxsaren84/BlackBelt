package ru.joxaren.workwithfile.trywithresourses;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("myfile.txt", true)){
            fileWriter.write("ok\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
