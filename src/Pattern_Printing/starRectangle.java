package Pattern_Printing;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of rectangle : ");
        int rows = sc.nextInt();

        System.out.print("Enter the columns of rectangle : ");
        int columns = sc.nextInt();

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
