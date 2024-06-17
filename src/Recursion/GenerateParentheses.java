package Recursion;

import java.util.Scanner;

public class GenerateParentheses {



    public static void print(String ans, int n,int open, int close) {

        if(n*2 == ans.length()){
            System.out.println(ans);
            return;
        }

        if(open == close){
            print(ans+"(",n,open+1,close);
        }else{
            if(open == n){
                print(ans+")",n,open,close+1);
            }else{
                print(ans+"(",n,open+1,close);
                print(ans+")",n,open,close+1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n =  sc.nextInt();

        print("",n,0,0);
    }
}
