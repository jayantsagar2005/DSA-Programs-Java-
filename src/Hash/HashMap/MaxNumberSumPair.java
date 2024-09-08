package Hash.HashMap;

import java.util.HashMap;

public class MaxNumberSumPair {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,3};
        int k = 6;

        int ans = maxOperations(arr, k);
        System.out.println(ans);
    }

    public static void fillMap(HashMap<Integer, Integer> map, int[] nums, int k){
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int n = map.get(nums[i]);
                map.put(nums[i], n+1);
            }else{
                int val = k - nums[i];
                map.put(val, 1);
            }
        }
    }
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        fillMap(map, nums, k);
        int ans = 0;

        for(int key : map.keySet()){
            int val = map.get(key);
            int n = val / 2;
            ans = ans + n;
        }

        return ans;
    }
}
