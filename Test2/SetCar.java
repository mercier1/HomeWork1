package Test2;

import java.util.Comparator;

public class SetCar implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (o1.getCoust()<o2.getCoust())?-1:1;
    }
}
