package RecursionDidi;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(0+" "+1+" ");
        fibSeries(n-2, a, b);
    }

    public static void fibSeries(int n, int a, int b) {
        if(n == 0) return;
        System.out.print(a+b+" ");
        fibSeries(n-1, b, a+b);
    }
}
