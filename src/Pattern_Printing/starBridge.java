package Pattern_Printing;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        for(int i=1; i<n*2; i++){
            System.out.print("* ");
        }
        System.out.println();

        for (int i=1; i<n; i++){
            for (int j=i; j<n; j++){
                System.out.print("* ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }

            for (int j=i-1; j>=1; j-- ){
                System.out.print("  ");
            }

            for (int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
