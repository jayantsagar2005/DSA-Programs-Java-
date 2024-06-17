package Pattern_Printing;

import java.util.Scanner;

public class Telegram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int count = -1;
        int a = 1;

        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<n-i; j++){
                if (a == 0){
                    System.out.print(a+" ");
                    a = 9;
                    count++;
                } else if (a == 9) {
                    System.out.print(a+" ");
                    a = 0;
                    count++;
                }else {
                    System.out.print(a+" ");
                    a++;
                }
            }
            System.out.println();
        }

        for (int i=n-2; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<n-i; j++){
                if (count == 0){
                    a = 8;
                    System.out.print(a+" ");
                    a--;
                    count--;
                }else if (a == 0){
                    System.out.print(a+" ");
                    a = 9;
                    count--;
                } else if (a == 9) {
                    System.out.print(a+" ");
                    a = 0;
                    count--;
                } else {
                    System.out.print(a+" ");
                    a--;
                }
            }
            System.out.println();
        }

    }
}
