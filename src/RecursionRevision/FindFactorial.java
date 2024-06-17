package RecursionRevision;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n =sc.nextInt();

        int ans = factorialResult(n);
        System.out.println("The factorial of number is : "+ans);
    }

    public static int factorialResult(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorialResult(n-1);
    }
}
