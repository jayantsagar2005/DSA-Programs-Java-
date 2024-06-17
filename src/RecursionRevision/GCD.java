package RecursionRevision;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a : ");
        int a = sc.nextInt();

        System.out.print("Enter the b : ");
        int b = sc.nextInt();

        int ans = gcd(a,b);
        System.out.println("The Greatest Common Divisor is : "+ans);
    }

    public static int gcd(int a, int b) {
        if (b%a == 0){
            return a;
        }

        return gcd(b%a, a);
    }
}
