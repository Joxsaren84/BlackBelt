package ru.joxaren.workwithfile.randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example {

    public static void main(String[] args) {

        try(RandomAccessFile accessFile = new RandomAccessFile("text.txt", "rw")){

            System.out.println(accessFile.getFilePointer());
            int i = accessFile.read();
            System.out.println((char) i);
            System.out.println(accessFile.readLine());
            accessFile.seek(0);
            accessFile.writeBytes("Season");
            accessFile.seek(accessFile.length() - 1);
            accessFile.writeBytes("\n\t\t\tUnknown author");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
