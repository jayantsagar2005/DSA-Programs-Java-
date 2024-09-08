package RecursionDidi;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        printFun(n,1);
    }

    public static void printFun(int n, int val) {
        if(n<val) return;
        System.out.print(val+" ");
        printFun(n, val+1);
    }
}
