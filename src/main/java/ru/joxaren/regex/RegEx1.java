package ru.joxaren.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

    public static void main(String[] args) {

        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Maria, Ukraine, Kiyev, Lomonosov street, 33, flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All star street, 87, flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952;";

        //Pattern pattern = Pattern.compile("\\w+"); //все слова
        //Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); //номера домов и квартир
        //Pattern pattern = Pattern.compile("\\+\\d{9}"); //номера телефонов
        //Pattern pattern = Pattern.compile("\\w+@+\\w+\\.(ru|com)"); //emails
        Pattern pattern = Pattern.compile("\\w+");

        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }

}
