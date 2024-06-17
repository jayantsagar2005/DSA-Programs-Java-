package Array_2D;

import java.util.Scanner;

public class productAllElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        int product = 1;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                product = product * array[i][j];
            }
        }

        System.out.println("The sum of all element is : "+product);
    }
}
