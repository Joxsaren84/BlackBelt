package ru.joxaren.impotant.enums;

public class Today {

    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){

        switch (weekDay) {
            case FRIDAY, MONDAY, TUESDAY, THURSDAY, WEDNESDAY -> System.out.println("You need to go to work!");
            case SATURDAY, SUNDAY -> System.out.println("You can to rest... ");
        }

        System.out.println("A mood in this day is " + weekDay.getMood());

    }
}
