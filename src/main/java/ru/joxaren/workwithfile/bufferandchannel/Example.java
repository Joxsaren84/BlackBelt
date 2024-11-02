package ru.joxaren.workwithfile.bufferandchannel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("text.txt", "rw");
            FileChannel channel = file.getChannel()){

            ByteBuffer buffer = ByteBuffer.allocate(20);
            StringBuilder text = new StringBuilder();

            int byteRead = channel.read(buffer);

            while(byteRead > 0){

                System.out.println("Read " + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()){
                    text.append((char)buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
