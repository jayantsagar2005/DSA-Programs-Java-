package Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();

        int max = Math.min(a,b);
        int result = 1;

        for (int i = 1; i <= max; i++) {
            if (a%i==0 && b%i==0){
                result = i;
            }
        }

        System.out.println("The Greatest Common Divisor is : "+result);


    }
}
