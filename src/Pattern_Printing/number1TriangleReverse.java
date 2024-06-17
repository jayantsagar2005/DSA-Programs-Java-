package Pattern_Printing;

import java.util.Scanner;

public class number1TriangleReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
