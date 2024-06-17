package RecursionRevision;

import java.util.Objects;
import java.util.Scanner;

public class PrintSubsetOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.next();

        print(s,0,"");
    }

    public static void print(String s, int i, String ans) {
        if(i == s.length()){
            if(Objects.equals(ans, "")){
                return;
            }else{
                System.out.println(ans);
                return;
            }
        }
        char ch = s.charAt(i);
        print(s,i+1,ans);
        print(s,i+1,ans+ch);
    }
}
