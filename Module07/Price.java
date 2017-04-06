package Module07;

import java.util.Comparator;

class Price implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    }
