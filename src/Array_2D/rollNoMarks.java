package Array_2D;

import java.util.Scanner;

public class rollNoMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] std = new int[4][2];


        std[0][0] = 1;
        std[0][1] = 90;
        std[1][0] = 2;
        std[1][1] = 85;
        std[2][0] = 3;
        std[2][1] = 95;
        std[3][0] = 4;
        std[3][1] = 99;

        for (int i=0; i<4; i++){
            for (int j=0; j<2; j++){
                System.out.print(std[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
