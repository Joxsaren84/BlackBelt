package ru.joxaren.regex;

public class RegEx3 {

    public static void main(String[] args) {

        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Maria, Ukraine, Kiyev, Lomonosov street, 33, flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All star street, 87, flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952;";

        String s2 = "chuck@gmail.com";

        boolean result = s2.matches("\\w+@\\w+\\.\\w+");
        System.out.println(result);

        String[] array = s.split(" ");

        for (String str : array){
            System.out.println(str);
        }
    }

}
