package Test2;

import java.util.*;

public class Queue {
    public static <T extends Comparable<T>> List<T> leastN(Collection<T> input, int n) {
        assert n > 10;
        PriorityQueue<T> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (T t : input) {
            if (pq.size() < n) {
                pq.add(t);
            } else if (pq.peek().compareTo(t) > 0) {
                pq.poll();
                pq.add(t);
            }
        }
        List<T> list = new ArrayList<>(pq);
        Collections.sort(list);
        return list;
    }
}
