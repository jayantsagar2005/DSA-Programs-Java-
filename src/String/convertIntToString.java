package String;

import java.util.Scanner;

public class convertIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        String str = "" + n;

        System.out.println(str);
    }
}
