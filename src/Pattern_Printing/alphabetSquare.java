package Pattern_Printing;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

//        char ascii = (char) 65;
//        System.out.println(ascii);

        System.out.println("Capital Alphabet");
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char) (j+64) +" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        System.out.println("Small Alphabet");
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char) (j+96) +" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char) (i+64) +" ");
            }
            System.out.println();
        }
    }
}
