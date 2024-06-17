package RecursionRevision;

import java.util.Scanner;

public class IncreasingSequenceNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        print(n,1);
    }

    public static void print(int n, int a) {
        if(a > n){
            return;
        }
        System.out.print(a+" ");
        print(n, a+1);
    }
}
