package ru.joxaren.impotant.scannerex;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try{
            scanner = new Scanner(new FileReader("text.txt"));
            scanner.useDelimiter("\\W");

            while (scanner.hasNext()){
                set.add(scanner.next());
            }

            for (String s : set){
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            scanner.close();
        }

    }
}
