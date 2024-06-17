package Pattern_Printing;

import java.util.Scanner;

public class numberSpiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n*2-1; i++){
            for (int j=1; j<=n*2-1; j++){

                int a = i;
                int b = j;

                if (i>n){
                    b = j;
                }
                if (j>n){
                    a = i;
                }
                System.out.print(n+1-Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
