package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int val;
    int freq;

    Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }

    public int compareTo(Pair p){
        return this.freq - p.freq;
    }
}

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int[] ans = frequencySort(arr);

//        for (int i=0; i<ans.length; i++){
//            System.out.print(ans[i]+" ");
//        }
    }

    public static int[] frequencySort(int[] arr) {
        int[] ans = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            if(map.containsKey(val)){
                int f = map.get(val);
                map.put(val, f+1);
            }else{
                map.put(val, 1);
            }
        }

        System.out.println(map);

        PriorityQueue<Pair> min = new PriorityQueue<>();

        for(int key : map.keySet()){
            int f = map.get(key);
            min.add(new Pair(key, f));
        }

        while(!min.isEmpty()){
            Pair p = min.remove();
            System.out.println(p.val+" "+p.freq);
        }



        return ans;
    }
}
