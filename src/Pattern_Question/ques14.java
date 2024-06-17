package Pattern_Question;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n-1; j++) {
                System.out.print("  ");

            }

            for (int j=i; j>=1; j--){
                System.out.print((char) (j+64)+" ");
            }

            for (int j=1; j<=i-1; j++){
                System.out.print((char)(j+65)+" ");

            }

            System.out.println();
        }
    }
}
