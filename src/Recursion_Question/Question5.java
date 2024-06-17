package Recursion_Question;

// Print index of a given element in an array. If not present, print -1.

import java.util.Scanner;

public class Question5 {

    private static int index = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 8, 2, 4, 9, 3, 10};
        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        foundElement(arr, n, 0);
        if (index != -1) {
            System.out.println("Index value is : " + index);
        }else{
            System.out.println("Element is not found.");
        }

    }

    public static void foundElement(int[] arr, int n, int k) {

        if(k == arr.length){
            return;
        }

        if (arr[k] == n) {
            index = k;
            return;
        }


        foundElement(arr, n, k + 1);


    }

}
