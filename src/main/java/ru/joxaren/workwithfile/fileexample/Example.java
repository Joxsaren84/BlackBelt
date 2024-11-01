package ru.joxaren.workwithfile.fileexample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Example {

    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");
        File file2 = new File("text2.txt");
        File dir = new File("D:"+ File.separator +"Java\\spring\\maven\\BlackBelt");
        File dir2 = new File("D:\\Java\\spring\\maven\\BlackBelt\\new_dir");

        System.out.println(File.separator);

        System.out.println("AbsolutePath " + file.getAbsolutePath());
        System.out.println("AbsolutePath " + dir.getAbsolutePath());

        System.out.println("exists " + file.exists());
        System.out.println("exists " + dir.exists());

        System.out.println("Create file " + file2.createNewFile());
        System.out.println("Create file " + dir2.mkdir());

        System.out.println("Is dir " + file.isDirectory());
        System.out.println("Is file " + file.isFile());

        System.out.println("Can write " + file.canWrite());
        System.out.println("Can read " + file.canRead());
        System.out.println("Can execute " + file.canExecute());

        System.out.println("Folder list " + Arrays.toString(dir.listFiles()));

        System.out.println("Is hidden " + dir.isHidden());

        System.out.println("File length " + file.length() + " bytes");

        System.out.println("Delete file " + file2.delete());
        System.out.println("Delete folder " + dir2.delete());

    }


}
