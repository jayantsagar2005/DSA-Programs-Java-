package BinarySearch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class binarySearch {

    public static int search(int target, int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target element : ");
        int k = sc.nextInt();

        int ans = search(k, arr);

        if (ans == -1) {
            System.out.println("Element is not found!");
        } else {
            System.out.println("Element is found of index " + ans);
        }
    }
}
