package module09;

import Module07.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static void delDuplicates(List<Order> list) {
        list.stream().distinct().collect(Collectors.toList());
    }

    private static void delLess(List<Order> list) {
        list.stream().filter(order -> order.getPrice() < 1500)
                .collect(Collectors.toList());
    }

    private static Map<Currency, List<Order>> splitForTwoLists(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
    }

    private static Map<String, List<Order>> splitForCities(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }

    public static void main(String[] args) {
        User user1 = new User(1, "Alex", "Black", "LasVegas", 5000);
        User user2 = new User(2, "Bob", "Marley", "Buffalo", 10000);
        User user3 = new User(3, "Tom", "Green", "LosAngeles", 3000);
        User user4 = new User(4, "Jack", "Brown", "LasVegas", 0);
        User user5 = new User(5, "Bill", "White", "Paris", 500);
        User user6 = new User(6, "Vasya", "Pypkin", "Kiev", 9400);
        User user7 = new User(7, "Petya", "Petrov", "Kharkov", 2222);
        User user8 = new User(8, "Andrey", "Sidorov", "Lviv", 23000);
        User user9 = new User(9, "Alexandr", "Great", "Amsterdam", 100000);
        User user10 = new User(10, "Ygin", "Stick", "NewYork", 50000);


        List<Order> list = new ArrayList<>();

        list.add(new Order(1, 2, Currency.USD, "Item1", "Indificator1", user1));
        list.add(new Order(2, 3, Currency.USD, "Item2", "Indificator2", user2));
        list.add(new Order(3, 4, Currency.USD, "Item3", "Indificator3", user3));
        list.add(new Order(4, 1, Currency.USD, "Item4", "Indificator4", user4));
        list.add(new Order(5, 12, Currency.EUR, "Item5", "Indificator5", user5));
        list.add(new Order(6, 5, Currency.EUR, "Item6", "Indificator6", user6));
        list.add(new Order(7, 8, Currency.EUR, "Item7", "Indificator7", user7));
        list.add(new Order(8, 5, Currency.EUR, "Item8", "Indificator8", user8));
        list.add(new Order(9, 7, Currency.EUR, "Item9", "Indificator9", user9));
        list.add(new Order(10, 11, Currency.EUR, "Item", "Indificator10", user10));

//sort by price
        list.sort((o1, o2) -> o1.getPrice() - o2.getPrice());

//sort by price & City
        list.sort((o1, o2) -> {
            if (o1.getPrice() == o2.getPrice()) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        });

//sort by itemName,shopIdentificator,City
        list.sort((o1, o2) -> {
            int item = o1.getItemName().compareTo(o2.getItemName());
            int shop = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int city = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            if (item == 0 && shop == 0) {
                return city;
            }
            if (item == 0 && city == 0) {
                return shop;
            }
            return item;
        });
//sort by currency


        delDuplicates(list);
        delLess(list);

    }
}
