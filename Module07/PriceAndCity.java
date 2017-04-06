package Module07;

import java.util.Comparator;

public class PriceAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
   int result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
        if(result==0){
           return Integer.compare(o1.getPrice(),o2.getPrice());
        }return result;
    }
}
