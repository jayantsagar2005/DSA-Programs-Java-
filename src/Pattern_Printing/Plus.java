package Pattern_Printing;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the row : ");
//        int n = sc.nextInt();

        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }

        for(int i=0; i<n+2; i++){
            System.out.print("* ");
        }

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }

    }
}
