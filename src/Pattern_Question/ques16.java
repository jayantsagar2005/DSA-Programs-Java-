package Pattern_Question;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
        }

        for (int i=n-1; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();


        for (int i=1; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }

            for (int j=1; j<i; j++){
                System.out.print("  ");
            }

            for (int j=n-i; j>=1; j--){
                System.out.print(j+" ");
            }


            System.out.println();
        }


    }
}
