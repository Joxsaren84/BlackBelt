package ru.joxaren.impotant.reflectionexamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TestMan {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        List<Man> manList = new ArrayList<>();
        Class manClass = Class.forName("ru.joxaren.impotant.reflectionexamples.Man");
        Constructor<Man> manConstructor = manClass.getConstructor(String.class, String.class);

        try(BufferedReader reader = new BufferedReader(new FileReader("men.txt"))){

            String line;

            while(true){
                line = reader.readLine();
                if(line == null) {
                    System.out.println("file is over");
                    break;
                }
                String name = line;
                String surname = reader.readLine();
                //System.out.println(name + " " + surname);

                manList.add(manConstructor.newInstance(name, surname));
            }

        } catch (IOException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        for (Man man : manList){
            System.out.println(man);
        }

    }
}
