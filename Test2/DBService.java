package Test2;

import java.util.HashSet;
import java.util.Set;

public class DBService {
    private static <T> void print(T[] inputArray) {
        for (T t : inputArray) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        System.out.println(set.size());
    }
}
