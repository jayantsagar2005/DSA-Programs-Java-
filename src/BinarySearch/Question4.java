package BinarySearch;

//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
//        inclusive in sorted order.There is only one repeated number in nums, return this repeated number.

public class Question4 {

    public static int repeatNumber(int[] arr) {
        int low = 0;
        int high = arr[arr.length-1];

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == mid+1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};

        int ans = repeatNumber(arr);

        System.out.println(ans);
    }
}
