package Array;

import java.util.Scanner;

public class minValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];


        for (int i=0; i<array.length; i++){
            System.out.print("Enter the "+(i+1)+" element : ");
            array[i] = sc.nextInt();
        }

        int min = array[0];

        for (int i=1; i<array.length; i++){
            if (min>array[i]){
                min = array[i];
            }
        }

        System.out.println("Maximum value of this array is "+min);
    }
}
