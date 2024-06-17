package BinarySearch;

import java.util.Scanner;



public class Question7 {

    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            int mid = low + (high - low) / 2;

            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] < key) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {58,54,53,50,41,40,38,31,22,10,8,5,1};

        System.out.print("Enter the search element : ");
        int key = sc.nextInt();

        int ans = search(arr, key);

        System.out.println(ans);
    }
}
