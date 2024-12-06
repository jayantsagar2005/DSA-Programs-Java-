package Recursion;

public class SubsetString {

    public static void print(String s,int i, String ans) {
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        print(s,i+1,ans);
        print(s,i+1,ans+ch);
    }

    public static void main(String[] args) {
        String s = "aaa";
        print(s,0,"");
    }

}
