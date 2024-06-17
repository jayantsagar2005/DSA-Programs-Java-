package Array;

import java.util.Scanner;

public class findXElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];


        for (int i=0; i<array.length; i++){
            System.out.print("Enter the "+(i+1)+" element : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the search element : ");
        int key = sc.nextInt();

        boolean flag = false;

        for (int i=0; i<array.length; i++){
            if (key==array[i]){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.print("Element is present this array.");
        }else{
            System.out.print("Element is not present this array.");
        }
    }
}
