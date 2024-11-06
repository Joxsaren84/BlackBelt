package ru.joxaren.workwithfile.pathandfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("txt.txt");
        Files.createFile(filePath);

        String dialog = "-Hi\n-Hello\n-How are you?\n-I'm fine thanks, and you?\n-I'm fine too!";

        Files.writeString(filePath, dialog);

        System.out.println(Files.readString(filePath));

    }
}
