package RecursionDidi;

import java.util.Scanner;

public class nNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int sum = sumOfNumber(n, 0);
        System.out.println("The sum of number is : "+sum);
    }

    public static int sumOfNumber(int n, int sum) {
        if(n == 0) return sum;
        return n + sumOfNumber(n-1, sum);
    }
}
