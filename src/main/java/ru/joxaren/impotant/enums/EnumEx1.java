package ru.joxaren.impotant.enums;

import java.util.Arrays;

public class EnumEx1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        Today today2 = new Today(WeekDays.SUNDAY);
        today2.daysInfo();
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.valueOf("SATURDAY");
        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }

}

enum WeekDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("grate"),
    SUNDAY("good");

    private final String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}