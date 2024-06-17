package Array_2D;

import java.util.Scanner;

public class rotate90Degree {

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

        int [][] ans = new int[columns][rows];

        for (int i=0; i<columns; i++){
            for(int j=0; j<rows; j++){
                ans[i][j] = matrix[j][i];
            }
        }

        int temp = rows;
        rows = columns;
        columns = temp;

        System.out.println("Transpose Array :");
        printMatrix(ans,rows,columns);

        for (int i=0; i<rows; i++){
            int a = 0;
            int b = columns-1;
            while (a<b){
                int temp1 = ans[i][a];
                ans[i][a] = ans[i][b];
                ans[i][b] = temp1;
                a++;
                b--;
            }
        }

        System.out.println("Rotate 90 Degree Matrix :");
        printMatrix(ans,rows,columns);


    }
}
