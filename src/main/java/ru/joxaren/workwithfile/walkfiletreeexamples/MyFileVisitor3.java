package ru.joxaren.workwithfile.walkfiletreeexamples;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor3 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File delete: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Direction delete: " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
