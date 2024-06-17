package Function;

import java.util.Scanner;

public class countNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int num = sc.nextInt();

        countNumber(num);

    }

    public static void countNumber(int n) {
        int count = 0;

        while (n!=0){
            n = n/10;
            count++;
        }

        System.out.println("The square number of digits is : "+count*count);
    }
}
