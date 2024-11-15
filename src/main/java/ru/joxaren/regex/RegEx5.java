package ru.joxaren.regex;

public class RegEx5 {

    public static void main(String[] args) {
        String s = "Hello  how     are         you  how           is  your    progress  in  Java";
        System.out.println(s.replace("Java", "SQL"));
        System.out.println(s.replaceAll(" {2,}", " "));
        System.out.println(s.replaceFirst(" {2,}", " "));

    }

}
