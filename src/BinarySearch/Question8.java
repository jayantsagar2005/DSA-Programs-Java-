package BinarySearch;

public class Question8 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 5;

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] == key){
                System.out.println(mid);
                break;
            } else if (arr[mid] < key) {
                low = mid  + 1;
            }else{
                high = mid  - 1;
            }
        }

    }
}
