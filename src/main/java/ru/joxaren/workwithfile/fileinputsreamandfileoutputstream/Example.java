package ru.joxaren.workwithfile.fileinputsreamandfileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream("D:\\ok.jpg");
            FileOutputStream outputStream = new FileOutputStream("ok.jpg");) {
            int i;
            while((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done!!!");
    }

}
