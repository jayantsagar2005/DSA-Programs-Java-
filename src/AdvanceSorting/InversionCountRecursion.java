package AdvanceSorting;

public class InversionCountRecursion {

    private static int count = 0;

    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        mergeSort(arr);
        print(arr);
        System.out.println();
        System.out.println("Total inversion count : "+count);
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
        inversionCount(a,b);
        mergeArray(a,b,arr);

        a = null;
        b = null;

    }

    public static void inversionCount(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;

        while (i<m && j<n){
            if(a[i] > b[j]){
                count = count + (m-i);
                j++;
            }else{
                i++;
            }
        }
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
