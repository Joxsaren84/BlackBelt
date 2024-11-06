package ru.joxaren.workwithfile.pathandfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example2 {

    public static void main(String[] args) {

        Path filePath = Paths.get("file200.txt");
        Path dirPath = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\test");
        Path dirPath2 = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\test2");
/*
        try {
            Files.copy(filePath, dirPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Done!");
            System.out.println("________________________________________________________");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Files.copy(dirPath, dirPath2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Files.move(filePath, dirPath2.resolve("file200.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.delete(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
    }

}
