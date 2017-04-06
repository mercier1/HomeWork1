package Test2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        List<Car> list=new ArrayList<>();
//        list.add(new Car("e","bmw",2));
//        list.add(new Car("b","bmw",3));
//        list.add(new Car("a","bmw",9));
//        list.add(new Car("d","bmw",9));
//        list.add(new Car("c","bmw",8));
//
//        List<Car> list2 = new ArrayList<>();
//        list2.addAll(list);
//     list2.sort(new CoustAndColor());
//        System.out.println(list);

//        Set<Car> se = new TreeSet<Car>(new SetCar());
//        se.add(new Car("e","mw",2));
//        se.add(new Car("b","bm",3));
//        se.add(new Car("a","mw",9));
//        se.add(new Car("c","mw",1));
//        System.out.println(se);
        Map<Car, Integer> map = new TreeMap<>(new Color());
        map.put(new Car("black", "o", 4), 40);
        map.put(new Car("white", "w", 1), 30);
        map.put(new Car("grey", "u", 5), 10);
        map.put(new Car("red", "p", 3), 20);

        System.out.println(map);


//       List<Map.Entry<Car,Integer>> lis=new ArrayList<>(map.entrySet());   //sort in Value
//        lis.sort(new Comparator<Map.Entry<Car, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Car, Integer> o1, Map.Entry<Car, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//        System.out.println(lis);
    }
    }




