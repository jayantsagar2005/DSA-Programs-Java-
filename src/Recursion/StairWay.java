package Recursion;

import java.util.Scanner;

public class StairWay {

    public static int stair(int n) {
        if(n==0 || n==1 || n==2){
            return n;
        }

        return stair(n-1) + stair(n-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stair : ");
        int n = sc.nextInt();

        int ans = stair(n);

        System.out.println(ans);
    }
}
