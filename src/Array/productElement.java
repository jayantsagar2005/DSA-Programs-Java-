package Array;

import java.util.Scanner;

public class productElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array  = new int[n];


        for (int i=0; i<array.length; i++){
            System.out.print("Enter "+(i+1)+" element : ");
            array[i] = sc.nextInt();
        }

        int product = 1;

        for (int ele : array){
            product = product * ele;
        }

        System.out.println("The sum all element of array : "+product);



    }
}
