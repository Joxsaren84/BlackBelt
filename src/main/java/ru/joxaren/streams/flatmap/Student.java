package ru.joxaren.streams.flatmap;

public class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrate;

    public Student(String name, char sex, int age, int course, double avgGrate) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrate = avgGrate;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrate() {
        return avgGrate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrate(double avgGrate) {
        this.avgGrate = avgGrate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrate=" + avgGrate +
                '}';
    }
}
