package Heap.MinHeap;

import java.util.PriorityQueue;

public class Basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        System.out.println(pq.peek());
        pq.add(20);
        System.out.println(pq.peek());
        pq.add(30);
        System.out.println(pq.peek());
        pq.add(100);
        System.out.println(pq.peek());
        pq.add(70);
        System.out.println(pq.peek());
        pq.add(65);
        System.out.println(pq.peek());
        pq.add(20);
        System.out.println(pq.peek());
        pq.add(1);
        System.out.println(pq.peek());
        pq.add(850);
        System.out.println(pq.peek());
        pq.add(152);
        System.out.println(pq.peek());
    }
}
