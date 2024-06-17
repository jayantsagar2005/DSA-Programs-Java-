package Recursion;

import java.util.Scanner;

public class PowerARasiedB {

    public static int power(int a, int b) {
        if(b==0){
            return 1;
        }

        return a * power(a,b-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int a = sc.nextInt();

        System.out.print("Enter the power : ");
        int b = sc.nextInt();

        int ans = power(a,b);
        System.out.println(ans);
    }
}
