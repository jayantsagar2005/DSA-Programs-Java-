package RecursionRevision;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the any number : ");
        int n = sc.nextInt();

        print(n);
        System.out.println();
        printExtraParameter(n,1);
    }

    public static void print(int n) {
        if (n == 0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    public static void printExtraParameter(int n, int count) {
        if(count > n){
            return;
        }
        System.out.print(count+" ");
        printExtraParameter(n,count+1);
    }
}
