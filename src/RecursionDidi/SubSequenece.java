package RecursionDidi;

public class SubSequenece {
    public static void main(String[] args) {
        String str = "abc";
        subString(str, "", 0);
    }

    public static void subString(String str, String ans, int idx) {
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        char ch  =str.charAt(idx);
        subString(str, ans, idx+1);
        subString(str, ans+ch, idx+1);
    }
}
