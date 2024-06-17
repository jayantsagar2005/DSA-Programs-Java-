package Array_2D;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st matrix rows : ");
        int r1 = sc.nextByte();

        System.out.print("Enter the 1st matrix columns : ");
        int c1 = sc.nextByte();

        System.out.print("Enter the 2nd matrix rows : ");
        int r2 = sc.nextByte();

        System.out.print("Enter the 2nd matrix columns : ");
        int c2 = sc.nextByte();

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        System.out.println();

        System.out.println("Enter the first matrix element.");
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                System.out.print("Enter the ("+(i+1)+","+(j+1)+") element : ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Enter the second matrix element.");
        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                System.out.print("Enter the ("+(i+1)+","+(j+1)+") element : ");
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        if (c1!=r2){
            System.out.println("Multiplication properties is not follow.");

        }else{
            for (int i=0; i<r1; i++){
                for (int j=0; j<c2; j++){
                    int sum = 0;
                    for (int k=0; k<r2; k++){
                        int product = 1;
                        product = m1[i][k] * m2[k][j];
                        sum = sum + product;
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
        }


    }
}
