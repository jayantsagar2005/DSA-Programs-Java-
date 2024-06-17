package BinarySearch;

//        Given a sorted array of n elements and a target ‘x’. Find the last occurrence of ‘x’ in the array. If ‘x’ does
//        not exist return -1.


public class Question1 {

    public static int search(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == n){

                while(arr[mid] == arr[mid+1]){
                    mid++;
                }

                return mid;

            } else if (arr[mid] < n) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,4,4,5};
        int key = 3;

        int ans = search(arr,key);

        System.out.println(ans);
    }
}
