package String;

import java.math.BigInteger;
import java.util.Scanner;

public class lengthOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        BigInteger n = BigInteger.valueOf(sc.nextLong());

        String str = "" + n;

        System.out.println("The length of digit : "+str.length());

    }
}
