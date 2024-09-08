package SlidingWindow;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        int k = 3;

        int i = 0;
        int j = k-1;

        int preSum = 0;

        for(int a=i; a<=j; a++){
            preSum = preSum + arr[a];
        }
        i = i +1;
        j = j +1;

        int max = preSum;


        while(j < arr.length){
            preSum = (preSum - arr[i-1]) + arr[j];
            if(preSum > max) max = preSum;
            i++;
            j++;
        }

        System.out.println(max);
    }
}
