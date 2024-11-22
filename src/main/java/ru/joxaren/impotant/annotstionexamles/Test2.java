package ru.joxaren.impotant.annotstionexamles;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Class.forName("ru.joxaren.impotant.annotstionexamles.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone)annotation;
        System.out.println("OS: " + sm1.OS() + "\nYear of company creation: " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("ru.joxaren.impotant.annotstionexamles.IPhone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone)annotation2;
        System.out.println("OS: " + sm2.OS() + "\nYear of company creation: " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class IPhone{
    String model;
    double price;
}