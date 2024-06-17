package LEETCODE_DSA;

public class reverseString {
    public static void main(String[] args) {
        String str = "Happy Coder";
        String result = reverseString(str);

        System.out.println(result);
    }

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder("");
        for (int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}
