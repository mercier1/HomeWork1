package Modul03.HomeWork3_1.Home3_3;
public class Course {
    int startDate;
    String name;
    int hoursDuration;
    String teacherName;
    public Course(int startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }
    public Course(int hourseDuration, String name,String teacherName ){
        this.hoursDuration=hourseDuration;
        this.name=name;
        this.teacherName=teacherName;
    }

}
