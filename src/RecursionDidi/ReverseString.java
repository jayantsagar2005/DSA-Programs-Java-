package RecursionDidi;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Happy Coder";

        reverse(str, 0);
    }

    public static void reverse(String str, int i) {
        if(i == str.length()) return;
        reverse(str, i+1);
        System.out.print(str.charAt(i));
    }
}

