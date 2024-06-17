package RecursionRevision;

import java.util.Scanner;

public class ARasiedPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of power : ");
        int a = sc.nextInt();

        System.out.print("Enter the power : ");
        int b = sc.nextInt();

        int ans = power(a, b);
        System.out.println("Answer is : "+ans);
    }

    public static int power(int a, int b) {
        if (b == 0){
            return 1;
        }
        if (a == 0){
            return 0;
        }
        return a * power(a, b-1);
    }
}
