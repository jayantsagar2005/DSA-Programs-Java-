package String;

import java.util.Scanner;

public class subStringPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        for (int i=0; i<str.length(); i++){
            for (int j=i; j<str.length(); j++){
                System.out.println(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
