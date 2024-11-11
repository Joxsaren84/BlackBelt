package ru.joxaren.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {

        String s1 = "ABCDABCAABCBABCCC2";
        //Pattern pattern = Pattern.compile("ABC"); //поиск подстроки
        //Pattern pattern = Pattern.compile("[ABC]"); //или A или B или С
        //Pattern pattern = Pattern.compile("A[B-D]C"); //A + символ из от B до D + C
        //Pattern pattern = Pattern.compile("C[B-D1-6]"); //C + символ из от B до D или 1 до 6
        //Pattern pattern = Pattern.compile("C[^B-D1-6]"); //C + не(символ из от B до D или 1 до 6)
        Pattern pattern = Pattern.compile("ABC(A|C)"); //ABC + либо A либо C
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }

    }

}
