package Modul03.HomeWork3_1.Home3_3;

public class Student {
    String firstName;
    String lastName;
    int group;
    Course[] coursesTaken;
    int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
    public Student(String firstName, String lastName, int group, Course[] coursesTaken, int age) {
       this.lastName = lastName;
        this.coursesTaken=coursesTaken;
    }

    public Student() {
    }
}
