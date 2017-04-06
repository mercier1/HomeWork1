package Test2;
public class Car {
    private String color;
    private String model;
    private int coust;

    public Car(String color, String model, int coust) {
        this.color = color;
        this.model = model;
        this.coust = coust;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public int getCoust() {
        return coust;
    }

    @Override
    public String toString() {
        return color+model+"  "+coust;
    }
}
