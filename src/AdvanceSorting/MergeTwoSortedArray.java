package AdvanceSorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {10,30,50,60,80,90};
        int m = arr1.length;

        int[] arr2 = {21,42,72,78};
        int n  = arr2.length;

        int[] ans = new int[m+n];

        mergeArray(arr1, arr2, ans);
        print(ans);

    }

    public static void mergeArray(int[] arr1, int[] arr2, int[] ans) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] > arr2[j]){
                ans[k] = arr2[j];
                j++;
            }else{
                ans[k] = arr1[i];
                i++;
            }
            k++;
        }

        if (arr1.length > arr2.length){
            for (int a=i; a<arr1.length; a++){
                ans[k] = arr1[a];
                k++;
            }
        }else{
            for (int a=j; a<arr2.length; a++){
                ans[k] = arr2[a];
                k++;
            }
        }
    }

    public static void print(int[] ans) {
        for (int a: ans ) {
            System.out.print(a+" ");
        }
    }
}
