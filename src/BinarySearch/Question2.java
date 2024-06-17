package BinarySearch;

//Given a sorted binary array, efficiently count the total number of 1’s in it.

public class Question2 {

    public static int countOne(int[] arr) {
        int ans = 0;
        int low = 0;
        int high = arr.length - 1;
        int lowerBound = arr.length;

        while (low<=high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= 1){
                lowerBound = Math.min(lowerBound,mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        ans =  arr.length - lowerBound;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};

        int ans = countOne(arr);

        System.out.println(ans);
    }
}
