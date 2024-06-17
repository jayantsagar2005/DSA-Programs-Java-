package Pattern_Printing;

import java.util.Scanner;

public class number1Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<n*2; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=1; i<n; i++){
            int a =1;
            for (int j=i; j<n; j++){
                System.out.print(a+" ");
                a++;
            }

            for (int j=1; j<=i; j++){
                System.out.print("  ");
                a++;
            }

            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
                a++;
            }

            for (int j=n-1; j>=i; j--){
                System.out.print(a+" ");
                a++;
            }

            System.out.println();
        }
    }
}
