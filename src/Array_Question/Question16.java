package Array_Question;

import java.math.BigInteger;
import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        BigInteger factorial = calculateFactorial(n);

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }


        return result;
    }

}

