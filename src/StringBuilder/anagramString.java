package StringBuilder;

import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the s string : ");
        String s = sc.nextLine();

        System.out.print("Enter the t string : ");
        String t = sc.nextLine();

        boolean ans = anagram(s,t);

        System.out.println(ans);


    }

    public static boolean anagram(String s, String t) {
        for (int i=0; i<s.length() && i<t.length(); i++){
            int count = 0;
            char ch = t.charAt(i);
            for (int j=0; j<s.length(); j++){
                if (ch == s.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                return false;
            }
        }

        return true;
    }
}
