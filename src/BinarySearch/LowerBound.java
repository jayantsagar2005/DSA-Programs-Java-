package BinarySearch;

import java.util.Scanner;

public class LowerBound {

    public static int search(int[] arr, int key) {

        int low = 0;
        int high = arr.length-1;
        int lowerBound = arr.length;

        if (arr[0] > key){
            return 0;
        }

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid] >= key){
                lowerBound = Math.min(lowerBound,mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        return lowerBound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,10,20,20,20,20,20,30,30,30,30,40,40};

        System.out.print("Enter the number : ");
        int target = sc.nextInt();

        int ans = search(arr, target);

        System.out.println(ans);
    }

}
