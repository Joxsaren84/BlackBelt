package ru.joxaren.workwithfile.pathandfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Example1 {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("file200.txt");
        Path dirPath = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\test");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("dirPath.getFileName(): " + dirPath.getFileName());
        System.out.println("______________________________________________");

        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("dirPath.getParent(): " + dirPath.getParent());
        System.out.println("______________________________________________");

        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("dirPath.getRoot(): " + dirPath.getRoot());
        System.out.println("______________________________________________");

        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute(): " + dirPath.isAbsolute());
        System.out.println("______________________________________________");

        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("dirPath.toAbsolutePath(): " + dirPath.toAbsolutePath());
        System.out.println("______________________________________________");

        System.out.println("filePath.getParent(): " + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.getRoot(): " + filePath.toAbsolutePath().getRoot());
        System.out.println("______________________________________________");

        System.out.println("dirPath.resolve(filePath): " + dirPath.resolve(filePath));
        System.out.println("______________________________________________");

        Path anotherPath = Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\test\\a\\b\\test.txt");
        System.out.println("dirPath.relativize(anotherPath): " + dirPath.relativize(anotherPath));
        System.out.println("______________________________________________");

        if (!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if (!Files.exists(dirPath)){
            Files.createDirectory(dirPath);
        }

        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath): " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath): " + Files.isExecutable(filePath));
        System.out.println("______________________________________________");

        System.out.println("Files.isSameFile(): "
                + Files.isSameFile(filePath, Paths.get("D:\\Java\\spring\\maven\\BlackBelt\\file200.txt")));

        System.out.println("______________________________________________");

        System.out.println("Files.size(filePath): " + Files.size(filePath) + " byte");

        System.out.println("______________________________________________");

        System.out.println("Files.getAttribute(filePath, \"creationTime\"): "
                + Files.getAttribute(filePath, "creationTime"));
        System.out.println("______________________________________________");

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");

        for(Map.Entry<String, Object> entry : attributes.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("______________________________________________");

    }


}
