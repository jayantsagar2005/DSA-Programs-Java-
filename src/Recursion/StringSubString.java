package Recursion;

public class StringSubString {

    public static void main(String[] args) {
        countSubstrings("abc");
    }

    public static void countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
