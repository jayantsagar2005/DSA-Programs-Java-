package Recursion;

import java.util.Scanner;

public class PowerARasiedBLogrithm {

    public static long power(int a, int b) {

        if(b==0){
            return 1;
        }

        long ans = power(a,b/2);

        if(b%2==0){
            return ans*ans;
        }else{
            return ans*ans*a;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int a = sc.nextInt();

        System.out.print("Enter the power : ");
        int b = sc.nextInt();

        long ans = power(a,b);

        System.out.println(ans);
    }
}
