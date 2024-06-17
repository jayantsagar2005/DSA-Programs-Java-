package Loops;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        int i=0;
        int j = str.length()-1;

        if (str.isEmpty()){
            System.out.println("Not Palindrome!");
        }

        while(i<j){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(j);

          if (ch1 != ch2){
              System.out.println("Not Palindrome!");
              return;
          }
          i++;
          j--;
        }

        System.out.println("Palindrome!");
    }
}
