package Recursion;

import java.util.Scanner;

public class GreatestCommonFactor {

    public static int printForLoop(int a, int b) {
        int min = Math.min(a,b);
        int ans = 1;
        for (int i=1; i<=min; i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }

        return ans;
    }

    public static int printForRecursively(int a, int b) {
        if(b%a == 0){
            return a;
        }
        return  printForRecursively(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a : ");
        int a = sc.nextInt();

        System.out.print("Enter the b : ");
        int b = sc.nextInt();

        int ans = printForLoop(a,b);
        System.out.println(ans);

        int ans1 = printForRecursively(a,b);
        System.out.println(ans1);
    }
}
