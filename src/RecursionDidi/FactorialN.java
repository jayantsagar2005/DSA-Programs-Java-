package RecursionDidi;

import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int ans = factorial(n, 1);
        System.out.println("The factorial is : "+ans);
    }

    public static int factorial(int n, int fac) {
        if(n == 1) return fac;
        return n * factorial(n-1, fac);
    }
}
