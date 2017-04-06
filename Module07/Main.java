package Module07;

import java.util.*;

public class Main {
    public static final int SOME_PRICE=1500;

    public static void main(String[] args) {
        User u1 = new User(11111, "ddd", "rrr", "trrr", 88);
        User u2 = new User(111111, "dduud", "rrhdbr", "tdsrrr", 88);
        User u3 = new User(121111, "drdd", "rrbdbdr", "tr;;rr", 88);
        User u4 = new User(113111, "dedd", "rrjr", "trrr", 88);
        User u5 = new User(114111, "ddwd", "rjfrr", "trrr", 88);
        User u6 = new User(115111, "ddqd", "rrr", "trrr", 88);
        User u7 = new User(116111, "ddwd", "rrnfnr", "trrr", 88);
        User u8 = new User(117111, "dsdd", "rrfnr", "trnfnrr", 88);
        User u9 = new User(117111, "dddgd", "rrr", "trrfnfr", 88);
        User u0 = new User(118111, "dhdd", "rrr", "trrkkr", 88);
        List<Order> list = new ArrayList<>();
        list.add(new Order(222722, 5, Currency.EUR, "a", "y1", u0));
        list.add(new Order(228222, 7, Currency.EUR, "b", "y2", u1));
        list.add(new Order(222022, 4, Currency.EUR, "c", "y3", u2));
        list.add(new Order(2266222, 1, Currency.EUR, "d", "y4", u3));
        list.add(new Order(2225422, 7, Currency.EUR, "e", "y5", u4));
        list.add(new Order(2225422, 8, Currency.EUR, "f", "y6", u5));
        list.add(new Order(2224322, 2, Currency.EUR, "g", "y7", u6));
        list.add(new Order(2222222, 3, Currency.EUR, "h", "y8", u7));
        list.add(new Order(22222312, 6, Currency.EUR, "i", "y9", u8));
        list.add(new Order(22211122, 9, Currency.EUR, "n", "y0", u9));
        list.sort(new Price());
        list.sort(new PriceAndCity());
        list.sort(new NameIdCity());
        System.out.println(list);
        les(list);
        ByCurrency(list);
        splitByCity(list);
    }
    private static void les(List<Order> list) {
        List<Order> less = new ArrayList<>();
        for (Order lp : list) {
            if (lp.getPrice() < SOME_PRICE) less.add(lp);
        }
        for (Order le : less) {
            less.remove(less);
        }
    }

    private static void ByCurrency(List<Order> list) {
        List<Order> usdList = new ArrayList<>();
        List<Order> eurList = new ArrayList<>();
        for (Order order : list) {
            if (order.getCurrency() == Currency.USD) usdList.add(order);
            if (order.getCurrency() == Currency.EUR) eurList.add(order);
        }
    }

    private static List<List<Order>> splitByCity(List<Order> list) {

        List<List<Order>> uniqueCityList = new ArrayList<>();
        Set<String> uniqueCities = new HashSet<>();

        for (Order order : list) {
            String city = order.getUser().getCity();
            if (uniqueCities.add(city)){
                List<Order> currentList = new ArrayList<>();
                currentList.add(order);
                uniqueCityList.add(currentList);
            }
            else {
                int index = 0;
                for (List<Order> orders : uniqueCityList) {
                    if (orders.get(index).getUser().getCity().equals(city)){
                        uniqueCityList.get(index).add(order);
                    }
                    else index++;
                }
            }
        }
        return uniqueCityList;
    }}