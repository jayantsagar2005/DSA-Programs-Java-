package Array;

import java.util.Arrays;
import java.util.Scanner;

public class largest2element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            array[i] = sc.nextInt();
        }

        int first = array[0];
        int second = array[1];

        int max = Math.max(first,second);
        int min = Math.min(first,second);

        first = max;
        second = min;

        for (int i=2; i<array.length; i++){

            if (first<array[i]){
                second = first;
                first = array[i];
            } else if (second<array[i]) {
                second = array[i];
            }
        }

        System.out.println(second);


    }
}
