package Modul03.HomeWork3_1.Home3_3;

public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age) {
        super(firstName, lastName, group, coursesTaken, age);
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
   public CollegeStudent(){

   }
}


