package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();

        int count = 1;
        int i = 0;

        while (i!=n){
            System.out.print(count+" ");
            count = count*2;
            i++;
        }
    }
}
