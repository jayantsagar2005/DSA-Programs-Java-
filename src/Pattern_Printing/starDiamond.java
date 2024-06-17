package Pattern_Printing;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=n-1; j>=i; j--){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--){
            for (int j=n-1; j>=i; j--){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j=1; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
