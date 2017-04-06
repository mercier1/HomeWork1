package Test2;

import java.util.Comparator;


public class Color implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        return o2.getColor().compareTo(o1.getColor());
    }
}
