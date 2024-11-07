package ru.joxaren.workwithfile.walkfiletreeexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\X");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}
