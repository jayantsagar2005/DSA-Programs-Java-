package Pattern_Question;

import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=n; j>=2; j--){
                if (i==j){
                    System.out.print(i+" ");
                    break;
                }else {
                    System.out.print("  ");
                }
            }

            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i-2; j++){
                System.out.print("  ");
            }

            System.out.print(i+" ");

            System.out.println();
        }

    }
}