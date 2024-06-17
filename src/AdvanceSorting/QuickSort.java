package AdvanceSorting;

public class QuickSort {

    public static void print(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 7, 7, 3, 2, 6, 5, 8};
        print(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partionIndex(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }

    }

    public static int partionIndex(int[] arr, int low, int high) {
        int pivot = low;
//        int i = low;
//        int j = high;
//
//        while (i < j) {
//            while (arr[i] <= pivot) {
//                i++;
//            }
//
//            while (arr[j] > pivot) {
//                j--;
//            }
//
//            if (i < j) {
//                swapping(arr, i, j);
//            }
//
//        }

        for (int a=low+1; a<=high; a++){
            if(arr[a] < arr[low]){
                swapping(arr,++pivot,a);
            }
        }

        swapping(arr, low, pivot);

        return pivot;

    }

    public static void swapping(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
