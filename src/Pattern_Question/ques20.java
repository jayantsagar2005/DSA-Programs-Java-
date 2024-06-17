package Pattern_Question;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=n; j>=2; j--){
                if (i==j){
                    System.out.print("* ");
                    break;
                }else {
                    System.out.print("  ");
                }
            }


            for (int j=1; j<=i-1; j++){

                System.out.print("  ");
            }

            for (int j=1; j<=i-2; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            System.out.println();
        }

        for (int j=1; j<=n*2-1; j++){
            System.out.print("* ");
        }
        System.out.println();

        for (int i=n; i>=1; i--){
            for (int j=n; j>=2; j--){
                if (i==j){
                    System.out.print("* ");
                    break;
                }else {
                    System.out.print("  ");
                }
            }

            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i-2; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            System.out.println();
        }

    }
}
