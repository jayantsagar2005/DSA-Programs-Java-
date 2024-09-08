package RecursionDidi;

import java.util.HashSet;

public class UniqueSubSequenece {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        helper(str, "", set, 0);
    }

    public static void helper(String str, String ans, HashSet<String> set, int idx) {
        if(idx == str.length()){
            if(!set.contains(ans)){
                set.add(ans);
                System.out.println(ans);
            }
            return;
        }
        char ch = str.charAt(idx);
        helper(str, ans, set, idx+1);
        helper(str, ans+ch, set, idx+1);
    }
}
