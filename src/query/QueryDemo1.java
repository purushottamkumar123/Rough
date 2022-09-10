package query;

import java.util.PriorityQueue;

public class QueryDemo1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(78);
        pq.offer(18);
        pq.offer(71);
        pq.offer(28);
        pq.offer(45);
        pq.offer(68);
        pq.offer(81);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
