package query;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.offer("puru");
        ad.offer("kunak");
        ad.offer("qwerty");
        ad.offer("asdfg");
        ad.offer("zxcvb");
        System.out.println(ad);

        ad.addFirst("purushottam");
        ad.addLast("jai sri ram");
        System.out.println(ad);
        ad.pollFirst();
        ad.pollLast();
        System.out.println(ad);



    }
}
