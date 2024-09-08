package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

class Triplate implements Comparable<Triplate> {
    int sqr;
    int x;
    int y;

    Triplate(int sqr, int x, int y){
        this.sqr = sqr;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplate t) {
        return this.sqr - t.sqr;
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{-2,2}};
        int k = 1;
        int[][] ans = kClosest(arr, k);

        for (int i=0; i<ans.length; i++){
            System.out.print("("+ans[i][0]+","+ans[i][1]+"), ");
        }
    }

    public static int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<Triplate> max = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            int x = arr[i][0];
            int y = arr[i][1];
            int sqr = (x*x) + (y*y);

            max.add(new Triplate(sqr, x, y));

            if(max.size()>k){
                max.remove();
            }

        }
        int[][] ans = new int[max.size()][2];
        int idx = 0;
        while(!max.isEmpty()){
            Triplate triplate = max.remove();
            ans[idx][0] = triplate.x;
            ans[idx][1] = triplate.y;
            idx++;
        }

        return ans;

    }
}
