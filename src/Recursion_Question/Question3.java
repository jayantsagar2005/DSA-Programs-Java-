package Recursion_Question;

// Given a positive integer, return true if it is a power of 2

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int n = sc.nextInt();

        if (checkPower(n)) {
            System.out.println("False");
        }else{
            System.out.println("True");
        }

    }

    public static boolean checkPower(int n) {

        if(n == 1){
            return false;
        }else if(n < 1 || n%2 != 0){
            return true;
        }

        return checkPower(n/2);
    }
}
