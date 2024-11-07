package ru.joxaren.workwithfile.walkfiletreeexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path source = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\X");
        Path destination = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\CopyHere");

        try {
            Files.walkFileTree(source, new MyFileVisitor2(source, destination));
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
