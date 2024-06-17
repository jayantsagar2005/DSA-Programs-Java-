package AdvanceSorting;

import java.util.Scanner;

public class KthLargestElement {

    private static int ans = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {9, 7, 1, 2, 6, 5, 8};

        System.out.print("Enter the kth position : ");
        int k = sc.nextInt();

        ans = -1;

        quickSelect(arr, 0, arr.length - 1, k);
        System.out.println(ans);
    }

    public static void quickSelect(int[] arr, int low, int high, int k) {

        if (low > high){
            return;
        }

        if (low == high){
            if (low == k-1){
                ans = arr[low];
                return;
            }
        }

        int index = partition(arr, low, high);
        if (index == k - 1) {
            ans = arr[index];
            return;
        }
        if (index > k - 1) {
            quickSelect(arr, low, index - 1, k);
        } else {
            quickSelect(arr, index + 1, high, k);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int smallerCount = 0;

        for (int i = low; i <= high; i++) {
            if (pivot > arr[i]) {
                smallerCount = smallerCount + 1;
            }
        }

        int correctIndex = low + smallerCount;

        swapping(arr, low, correctIndex);

        int i = low;
        int j = high;

        while (i < correctIndex && j > correctIndex) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            swapping(arr, i, j);
        }

        return correctIndex;
    }

    public static void swapping(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
