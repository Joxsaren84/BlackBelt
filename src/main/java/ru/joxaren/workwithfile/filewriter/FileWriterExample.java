package ru.joxaren.workwithfile.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("myfile.txt", true);
            fileWriter.write("Hello world!!!\nHello me!\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }

        System.out.println("Done!");
    }
}
