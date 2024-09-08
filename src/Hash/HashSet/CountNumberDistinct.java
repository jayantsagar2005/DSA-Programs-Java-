package Hash.HashSet;

import java.util.HashSet;

public class CountNumberDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 13, 24, 31, 46};

        int ans = countNumber(arr);

        System.out.println("Count number distinct : "+ans);
    }

    public static int countNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }

        return set.size();
    }

    public static int reverse(int n) {
        int ans = 0;

        while(n != 0){
            int r = n % 10;
            ans = ans * 10 + r;
            n = n / 10;
        }

        return ans;
    }
}
