package RecursionRevision;

import java.util.Scanner;

public class SumReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.println("The sum is : "+ans);
    }

    public static int sum(int n) {
        if (n == 1){
            return 1;
        }

        return n + sum(n-1);

    }
}
