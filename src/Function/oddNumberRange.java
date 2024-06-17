package Function;

import java.util.Scanner;

public class oddNumberRange {

    public static void oddNumber(int start, int end) {

        if (start%2==0){
            start++;
        }

        for (int i=start; i<=end; i = i+2){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number : ");
        int s = sc.nextInt();

        System.out.print("Enter the ending number : ");
        int e = sc.nextInt();

        oddNumber(s,e);

    }
}
