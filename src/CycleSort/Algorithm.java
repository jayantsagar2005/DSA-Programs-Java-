package CycleSort;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : "); // input array size
        int n = sc.nextInt();

        int[] arr = new int[n]; // array declaration

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array : ");
        print(arr); // print the original array

        // algorithm (main part)
        int i = 0;
        while(i < n){
            while(arr[i] != i){
                swapping(arr[i], arr[arr[i]], arr);
            }
            i++;
        }

        System.out.print("Sorted array : ");
        print(arr); // print sorted array
    }

    // print function
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // swapping function
    public static void swapping(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
