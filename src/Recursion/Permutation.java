package Recursion;

public class Permutation {

    public static int count = 1;

    public static void print(String s,String ans) {
        if(s.isEmpty()){
            System.out.println(count + " : "+ans);
            count++;
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left  = s.substring(0,i);
            String right = s.substring(i+1);
            print(left+right,ans+ch);
        }
    }

    public static void main(String[] args) {
        String s = "jayant";
        print(s,"");
    }
}
