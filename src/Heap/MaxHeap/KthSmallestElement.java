package Heap.MaxHeap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {-5,4,7,85,74,62,812,-55,74,45,420,-42};
        int k = 4;

        int ans = helper(arr, k);
        System.out.println(ans);
    }

    public static int helper(int[] arr, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            min.add(arr[i]);
            if(min.size() > k) min.remove();
        }

        return min.peek();
    }
}
