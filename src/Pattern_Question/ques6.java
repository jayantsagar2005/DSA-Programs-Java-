package Pattern_Question;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n*2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
