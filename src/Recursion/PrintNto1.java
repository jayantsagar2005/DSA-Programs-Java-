package Recursion;

import java.util.Scanner;

public class PrintNto1 {

    public static void print(int x,int n) {
        if(n==x){
            System.out.print(x+" ");
            return;
        }

        System.out.print(x+" ");
        print(x+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print(1,n);
    }
}
