package Module07;

import java.util.Comparator;

public class NameIdCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getItemName().compareTo(o2.getItemName()) == 0 && o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        }
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
