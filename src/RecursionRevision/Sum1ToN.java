package RecursionRevision;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        sumPrint(n,0);
    }

    public static void sumPrint(int n, int sum) {
        if(n == 0){
            System.out.println("Sum is : "+sum);
            return;
        }
        sum = sum + n;
        sumPrint(n-1, sum);
    }
}
