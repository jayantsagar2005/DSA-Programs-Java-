package Pattern_Printing;

import java.util.Scanner;

public class Hurt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            for (int j=1; j<n-i; j++){
                System.out.print("  ");
            }

            for (int j=n-i; j<=n; j++){
                System.out.print("* ");
            }

            for (int j=n-i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=0; i<n+3; i++){
            for (int j=0; j<(n*2-1)/3; j++){
                System.out.print("* ");
            }

            for (int j=0; j<(n*2-1)/3+1; j++){
                System.out.print("  ");
            }

            for (int j=0; j<(n*2-1)/3; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
