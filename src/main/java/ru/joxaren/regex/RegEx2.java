package ru.joxaren.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {

        String s1 = "ABCDABCAAB ACBAB _CCC2!!!";
        //Pattern pattern = Pattern.compile("ABC"); //поиск подстроки
        //Pattern pattern = Pattern.compile("[ABC]"); //или A или B или С
        //Pattern pattern = Pattern.compile("A[B-D]C"); //A + символ из от B до D + C
        //Pattern pattern = Pattern.compile("C[B-D1-6]"); //C + символ из от B до D или 1 до 6
        //Pattern pattern = Pattern.compile("C[^B-D1-6]"); //C + не(символ из от B до D или 1 до 6)
        //Pattern pattern = Pattern.compile("ABC(A|C)"); //ABC + либо A либо C
        //Pattern pattern = Pattern.compile("ABC."); //ABC + любой сивол кроме перехода на новую строку
        //Pattern pattern = Pattern.compile("^ABC"); //выражение в начале строки?
        //Pattern pattern = Pattern.compile("CCC2$"); //выражение в конце строки?
        //Pattern pattern = Pattern.compile("\\d"); //одна цифра
        //Pattern pattern = Pattern.compile("\\D"); //одна не цифра
        //Pattern pattern = Pattern.compile("\\w"); //соответствует любой букве, цифре или _
        //Pattern pattern = Pattern.compile("\\w+"); //выражение соответствует одному или большему к-ву повторений
        //Pattern pattern = Pattern.compile("\\W"); //любой символ не буква, не цифра или не _
        Pattern pattern = Pattern.compile("\\w{5}"); //соответствует к-ву повторений {n}

        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }

    }

}
