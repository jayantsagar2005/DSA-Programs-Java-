package Loops;

import java.util.Scanner;

public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();

        int i = 0;
        int count = 3;
        int sum = 3;

        System.out.print(count+" ");

        while (i!=n){
            count = count*3;
            sum = sum + count;
            count = sum;
            System.out.print(sum+" ");

            i++;
        }




    }
}
