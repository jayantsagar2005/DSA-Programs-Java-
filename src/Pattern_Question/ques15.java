package Pattern_Question;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n*2-1; i++){
            System.out.print((char) (i+64)+" ");
        }

        System.out.println();

        for (int i=1; i<n; i++){
            int a = 1;
            for (int j=i; j<n; j++){
                System.out.print((char) (a+64)+" ");
                a++;
            }

            for (int j=1; j<=i; j++){
                System.out.print("  ");
                a++;
            }

            for (int j=1; j<i; j++){
                System.out.print("  ");
                a++;
            }

            for (int j=i; j<n; j++){
                System.out.print((char) (a+64)+" ");
                a++;
            }


            System.out.println();
        }


    }
}
