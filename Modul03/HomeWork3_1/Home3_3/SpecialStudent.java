package Modul03.HomeWork3_1.Home3_3;
public class SpecialStudent extends CollegeStudent{
    long secretKey;
    String email;
    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }
    public SpecialStudent(long secretKey){
        this.secretKey=secretKey;
    }



}
