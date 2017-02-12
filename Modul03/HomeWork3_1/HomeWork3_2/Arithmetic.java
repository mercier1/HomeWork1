package Modul03.HomeWork3_1.HomeWork3_2;
public class Arithmetic {
  public int a = 4, b = 6, sum;

   public int add(Integer a, Integer b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Arithmetic arithmetic=new Arithmetic();
        Adder adder=new Adder();
        System.out.println(adder.check(9,7));
        System.out.println(arithmetic.add(9,8));
    }
}
