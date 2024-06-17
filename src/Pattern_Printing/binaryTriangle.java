package Pattern_Printing;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int k=1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (k==1){
                    System.out.print(k+" ");
                    k=0;
                }else {
                    System.out.print(k+" ");
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
