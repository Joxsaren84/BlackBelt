package ru.joxaren.workwithfile.walkfiletreeexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {

    public static void main(String[] args) {

        Path path = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\CopyHere");

        try {
            Files.walkFileTree(path, new MyFileVisitor3());
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
