package Pattern_Question;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = i; j <= n-1; j++) {
                System.out.print("  ");

            }

            for (int j=1; j<=i; j++){
                System.out.print((char)(a+64)+" ");
                a++;
            }

            for (int j=1; j<=i-1; j++){
                System.out.print((char)(a+64)+" ");
                a++;
            }

            System.out.println();
        }
    }
}
