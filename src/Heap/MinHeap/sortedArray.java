package Heap.MinHeap;

import java.util.PriorityQueue;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9,-5,-10,85,72,0,86,-99,75};

        sorted(arr);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sorted(int[] arr) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int idx = 0;

        for (int i=0; i<arr.length; i++){
            min.add(arr[i]);
        }

        while(!min.isEmpty()){
            arr[idx]  = min.remove();
            idx++;
        }
    }
}
