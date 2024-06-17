package RecursionRevision;

import java.util.Scanner;

public class PreInPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        preInPost(n);
    }

    public static void preInPost(int n) {

        if (n == 0){
            return;
        }

        System.out.print(n); // Pre

        preInPost(n-1);
        System.out.print(n); // In

        preInPost(n-1);
        System.out.print(n); // Post

    }
}
