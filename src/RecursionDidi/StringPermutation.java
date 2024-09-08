package RecursionDidi;

public class StringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        permutationPrint(s, "");
    }

    public static void permutationPrint(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String newStr = s.substring(0,i) + s.substring(i+1);
            permutationPrint(newStr, ans+ch);
        }

    }
}
