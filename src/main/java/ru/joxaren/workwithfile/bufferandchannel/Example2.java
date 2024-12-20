package ru.joxaren.workwithfile.bufferandchannel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example2 {

    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("text2.txt", "r");
            FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();

            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();
            System.out.println((char)buffer.get());

            buffer.compact();
            channel.read(buffer);
            buffer.flip();

            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }

            buffer.clear();

            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();

            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
