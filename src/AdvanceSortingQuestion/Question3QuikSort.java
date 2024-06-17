package AdvanceSortingQuestion;

//Q3. Given an array where all its elements are sorted in increasing order except two swapped elements,
//        sort it in linear time. Assume there are no duplicates in the array.
//        Input: A[] = [3, 8, 6, 7, 5, 9, 10]
//        Output: A[] = [3, 5, 6, 7, 8, 9, 10]

public class Question3QuikSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};

//        int[] arr = {9,8,7,6,5,4,3,2,1};
        int low = 0;
        int high = arr.length-1;

        int mid = (low + high)/2;
//        int pivot = arr[mid];

        int i = 0;
        int j = high;
        int count = 0;

        while(i<mid && j>mid && count < 2){
            while (arr[i] < arr[mid]){
                i++;
            }
            while (arr[j] > arr[mid]){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            count++;
        }

        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}

