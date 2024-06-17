package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        System.out.print("Fibonacci series : ");
        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i=1; i<=n-2; i++){
            sum = a + b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }

    }
}
