package ru.joxaren.game;

public class TestGame {
    public static void main(String[] args) {
        Schooler sc1 = new Schooler("Anton", 12);
        Schooler sc2 = new Schooler("Irina", 10);

        Schooler sc3 = new Schooler("Alex", 11);
        Schooler sc4 = new Schooler("George", 14);

        Student st1 = new Student("Ivan", 20);
        Student st2 = new Student("Roman", 19);

        Employee emp1 = new Employee("Egor", 30);
        Employee emp2 = new Employee("Vasily", 35);

        Team <Schooler> schoolarTeam = new Team<>("Wild dogs");
        schoolarTeam.addNewPlayer(sc1);
        schoolarTeam.addNewPlayer(sc2);

        Team <Student> studentTeam = new Team<>("Hot dogs");
        studentTeam.addNewPlayer(st1);
        studentTeam.addNewPlayer(st2);

        Team <Schooler> schoolerTeam2 = new Team<>("Heroes");
        schoolerTeam2.addNewPlayer(sc3);
        schoolerTeam2.addNewPlayer(sc4);

        schoolarTeam.playWith(schoolerTeam2);

    }
}
