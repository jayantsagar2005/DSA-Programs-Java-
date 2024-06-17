package AdvanceSorting;

public class QuickSortMidPivot {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 3, 2, 6, 5, 8};

        System.out.print("Unsorted Array : ");
        print(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array : ");
        print(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int mid = (low+high)/2;  // mid find
        int pivot = arr[mid];
        int smallerNumber = 0;

        for (int i = low; i <= high; i++) {
            if (i == mid){  // condition add
                continue;
            }
            if (pivot > arr[i]) {
                smallerNumber = smallerNumber + 1;
            }
        }

        int correctIndex = low + smallerNumber;

        swapping(arr, mid, correctIndex);  //change mid = low

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
