package Array_2D;

import java.util.Scanner;

public class transposeSquareMatrix {

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

        System.out.println("Original Array :");
        printMatrix(matrix,rows,columns);

        for (int i=0; i<rows; i++){
            for (int j=i; j<columns; j++){
                if (i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        System.out.println("Transpose Matrix :");
        printMatrix(matrix,rows,columns);

    }
}
