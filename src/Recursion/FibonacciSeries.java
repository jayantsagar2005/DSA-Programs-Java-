package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    public static int print(int n) {

        if(n==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;

        for (int i=0; i<n-1; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int ans = print(n);
        System.out.println(ans);
    }
}
