package Array;

import java.util.Scanner;

public class sumElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array  = new int[n];


        for (int i=0; i<array.length; i++){
            System.out.print("Enter "+(i+1)+" element : ");
            array[i] = sc.nextInt();
        }

        int sum = 0;

        for (int ele : array){
            sum = sum + ele;
        }

        System.out.println("The sum all element of array : "+sum);



    }
}
