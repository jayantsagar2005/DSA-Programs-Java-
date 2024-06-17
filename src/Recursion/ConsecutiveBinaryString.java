package Recursion;

import java.util.Scanner;

public class ConsecutiveBinaryString {

    public static void print(String ans, int n) {
        if(n == ans.length()){
            System.out.println(ans);
            return;
        }

        if(ans.isEmpty()){
            print(ans+"0",n);
            print(ans+"1",n);
        }else{
            char ch = ans.charAt(ans.length()-1);
            if(ch == '1'){
                print(ans+"0",n);
            }else{
                print(ans+"0",n);
                print(ans+"1",n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        print("",n);
    }
}
