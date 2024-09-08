package Heap.MaxHeap;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair{
    int a;
    int b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}

public class KClosestPoint {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{-2,2}};
        int k = 1;
        int[][] ans = kClosest(arr, k);

        for (int i=0; i<ans.length; i++){
            System.out.print("("+ans[i][0]+","+ans[i][1]+"), ");
        }
    }

    public static int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Pair> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int v1 = arr[i][0] * arr[i][0];
            int v2 = arr[i][1] * arr[i][1];
            int val = v1 + v2;
            map.put(val, new Pair(arr[i][0], arr[i][1]));
            max.add(val);
            if(max.size() > k){
                max.remove();
            }

        }
        int[][] ans = new int[max.size()][2];
        int idx = 0;

        while(!max.isEmpty()){
            int val = max.remove();
            Pair pair = map.get(val);
            ans[idx][0] = pair.a;
            ans[idx][1] = pair.b;
            idx++;
        }
        return ans;
    }
}
