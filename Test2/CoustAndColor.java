package Test2;

import java.util.Comparator;

public class CoustAndColor implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getCoust()==o2.getCoust()) {
            return o1.getColor().compareTo(o2.getColor());
        }
    return o1.getCoust()-o2.getCoust();
    }}
