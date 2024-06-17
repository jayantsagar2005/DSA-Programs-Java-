package Array_2D;

import java.util.Scanner;

public class waveForm2 {

    public static void printMatrix(int[][] array,int r, int c) {
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of matrix : ");
        int rows = sc.nextInt();

        System.out.print("Enter the column of matrix : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print("Enter the ("+(i+1)+","+(j+1)+") element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Original Array :");
        printMatrix(matrix,rows,columns);

        System.out.println("Wave Form");
        for (int i=0; i<rows; i++){
            if (i%2!=0){
                for (int j=0; j<columns; j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{
                for (int j=columns-1; j>=0; j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
