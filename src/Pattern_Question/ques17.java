package Pattern_Question;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-1; j++){
               if(i==j){
                   System.out.print("* ");
                   break;
               }else {
                   System.out.print("  ");
               }
            }

            for (int j=i; j<=n-1; j++){
                System.out.print("  ");
            }

            for (int j=i; j<=n-2; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            System.out.println();
        }

    }
}
