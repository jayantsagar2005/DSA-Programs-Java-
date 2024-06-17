package Recursion_Question;

// Q1. Write a program to calculate the sum of odd numbers between a and b (both inclusive) using recursion.

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number : ");
        int a = sc.nextInt();

        System.out.print("Enter the end number : ");
        int b = sc.nextInt();

        int ans = sum(a, b);
        System.out.println(ans);
    }

    public static int sum(int a, int b) {

        if (a == b) {
            if (a % 2 == 0) {
                return 0;
            } else {
                return a;

            }
        }

        if (a % 2 == 0) {
            return sum(a + 1, b);
        } else {
            return a + sum(a + 1, b);

        }
    }
}
