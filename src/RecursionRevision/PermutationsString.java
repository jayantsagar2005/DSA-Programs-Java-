package RecursionRevision;

import java.util.Scanner;

public class PermutationsString {
    static int count = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.next();

        print(s,"");
    }

    public static void print(String s, String ans) {
        if(s.isEmpty()){
            System.out.println(count + " " +ans);
            count++;
            return;
        }

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            print(left+right, ans+ch);
        }
    }
}
