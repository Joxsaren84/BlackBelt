package ru.joxaren.workwithfile.dataoutputstreamanddatainputstream;

import java.io.*;

public class Example {

    public static void main(String[] args) {

        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("mytest.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("mytest.bin"))){

            outputStream.writeBoolean(true);
            outputStream.writeFloat(3.14f);
            outputStream.writeInt(100);
            outputStream.writeLong(4_000_000_000L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
