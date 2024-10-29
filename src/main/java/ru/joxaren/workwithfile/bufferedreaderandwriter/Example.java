package ru.joxaren.workwithfile.bufferedreaderandwriter;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
            BufferedWriter writer= new BufferedWriter(new FileWriter("myfile2.txt"))){

            String line;
            while((line = reader.readLine())!=null){
                writer.write(line + "\n");
            }

            System.out.println();
        }
    }
}
