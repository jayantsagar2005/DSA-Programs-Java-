package Pattern_Question;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j=i; j<=n-1; j++){
                System.out.print("  ");
            }

            for (int j=i; j<=n-2; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int j=1; j<=n*2-1; j++){
            System.out.print("* ");
        }

        System.out.println();
        for (int j=1; j<=n*2-1; j++){
            System.out.print("* ");
        }

        System.out.println();
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j=i; j<=n-1; j++){
                System.out.print("  ");
            }

            for (int j=i; j<=n-2; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
