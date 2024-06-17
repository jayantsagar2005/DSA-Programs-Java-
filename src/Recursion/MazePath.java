package Recursion;

import java.util.Scanner;

public class MazePath {

    public static int mazePath(int m, int n) {
        if(m==1){
            return 1;
        }
        if(n==1){
            return 1;
        }


        int rightWay = mazePath(m-1,n);
        int leftWay = mazePath(m,n-1);
        System.out.println();

        return rightWay + leftWay;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the m : ");
        int m = sc.nextInt();

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        int ans = mazePath(m,n);

        System.out.println(ans);
    }
}
