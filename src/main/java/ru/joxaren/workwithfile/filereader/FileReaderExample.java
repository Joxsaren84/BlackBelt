package ru.joxaren.workwithfile.filereader;

import ru.joxaren.Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("myfile.txt");
            int character;
            while((character = fileReader.read()) != -1){
                System.out.print((char)character);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileReader.close();
        }

        System.out.println("\nDone");

    }

}
