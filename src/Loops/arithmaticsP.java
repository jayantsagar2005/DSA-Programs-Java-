package Loops;

import java.util.Scanner;

public class arithmaticsP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();

        for(int i=4; i<=3*n+3; i+=3){
            System.out.print(i+" ");
        }
    }
}
