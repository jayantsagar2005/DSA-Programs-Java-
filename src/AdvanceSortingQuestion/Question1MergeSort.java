package AdvanceSortingQuestion;

//1. Given an array of integers, sort it in descending order using merge sort algorithm.

public class Question1MergeSort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 3, 2, 6, 5, 8};

        System.out.print("Unsorted Array : ");
        print(arr);

        mergeSort(arr);

        System.out.print("Sorted Array : ");
        print(arr);
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n == 1){
            return;
        }

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for (int i=0; i<a.length; i++){
            a[i] = arr[i];
        }

        for (int i=0; i<b.length; i++){
            b[i] = arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);
        mergerArray(a,b,arr);
    }

    public static void mergerArray(int[] arr1, int[] arr2, int[] ans) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr2[j];
                j++;
            }else{
                ans[k] = arr1[i];
                i++;
            }
            k++;
        }

        while (i < arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
    }
}
