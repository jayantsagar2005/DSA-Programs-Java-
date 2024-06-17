package Array_2D;

import java.util.Scanner;

public class sumAllElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = {{12,25,42},{85,75,9},{10,74,71}};

        int sum = 0;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                sum = sum + array[i][j];
            }
        }

        System.out.println("The sum of all element is : "+sum);
    }
}
