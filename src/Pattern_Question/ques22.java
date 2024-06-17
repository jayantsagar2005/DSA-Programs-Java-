package Pattern_Question;

import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {


            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                if (i==1 && j==1){
                    continue;
                }

                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {


            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                if (i==1 && j==1){
                    continue;
                }

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
