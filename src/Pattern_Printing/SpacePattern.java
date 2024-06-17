package Pattern_Printing;

import java.util.Scanner;

public class SpacePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }

            for (int j=0; j<i; j++){
                System.out.print("  ");
            }

            for (int j=0; j<i; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i=n-2; i>=0; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }

            for (int j=0; j<i; j++){
                System.out.print("  ");
            }

            for (int j=0; j<i; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
