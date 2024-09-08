package Heap.MaxHeap;

import java.util.Collections;

import java.util.PriorityQueue;

public class Basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);
        max.add(10);

        System.out.println(max);
    }
}
