package RecursionRevision;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int ans = fib(n);
        System.out.println("Answer is : "+ans);
    }

    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        return fib(n-1) + fib(n-2);

    }
}
