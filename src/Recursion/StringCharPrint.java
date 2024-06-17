package Recursion;

public class StringCharPrint {

    public static void print(String s, int n) {
        if (n == -1) {
            return;
        }

        print(s, n - 1);
        System.out.print(s.charAt(n));

    }

    public static void print2(String s, int i) {
        if(i == s.length()){
            return;
        }
        if (s.charAt(i) != 'a'){
            System.out.print(s.charAt(i));
        }
        print2(s,i+1);
    }


    public static void main(String[] args) {

        String s = "Jayant Sagar";

        print(s, s.length() - 1);
        System.out.println();

        print2(s,0);
        System.out.println();

    }
}
