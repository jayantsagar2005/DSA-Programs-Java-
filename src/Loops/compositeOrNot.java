package Loops;

import java.util.Scanner;

public class compositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int count = 0;

        for (int i=2; i<n/2; i++){
            if (n%i==0){
                count++;
                break;
            }
        }

        if (n==1){
            System.out.println("Nether prime and not composite number");
        } else if (count == 0) {
            System.out.println("Prime NUmber");
        }else{
            System.out.println("Composite Number");
        }

    }
}
