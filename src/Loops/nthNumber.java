package Loops;

import java.util.Scanner;

public class nthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the last number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
