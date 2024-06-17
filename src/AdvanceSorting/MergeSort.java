package AdvanceSorting;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {180,5,70,300,60,40,50,20};
        int[] arr = {4, 9, 7, 1, 3, 2, 6, 5, 8};
        mergeSort(arr);
        print(arr);
    }

    public static void print(int[] ans) {
        for (int a: ans ) {
            System.out.print(a+" ");
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if(n == 1){
            return;
        }

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for (int i=0; i<n/2; i++){
            a[i] = arr[i];
        }

        for (int i=0; i<n-n/2; i++){
            b[i] = arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);
        mergeArray(a,b,arr);


    }

    public static void mergeArray(int[] arr1, int[] arr2, int[] ans) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] >= arr2[j]){
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
