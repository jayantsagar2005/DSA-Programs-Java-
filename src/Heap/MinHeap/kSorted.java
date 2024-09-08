package Heap.MinHeap;

import java.util.PriorityQueue;

public class kSorted {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;

        sorted(arr, k);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sorted(int[] arr, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int idx = 0;

        for (int i=0; i<arr.length; i++){
            min.add(arr[i]);
            if(min.size() > k){
                arr[idx]  = min.remove();
                idx++;
            }
        }

        while(!min.isEmpty()){
            arr[idx]  = min.remove();
            idx++;
        }
    }
}
