package RecursionDidi;

public class MoveXToLast {
    public static void main(String[] args) {
        String str = "axbcxxd";
        String ans = moveX(str, 0, 0, 'x', "");
        System.out.println(ans);
    }

    public static String moveX(String str, int n, int idx, char ele, String ans) {
        if (n == str.length()) {
            for(int i=0; i<idx; i++){
                ans = ans + 'x';
            }
            return ans;
        }
        char ch = str.charAt(n);
        if(ch == ele){
            idx++;
        }else{
            ans = ans + ch;
        }
        return moveX(str, n+1, idx, ele, ans);
    }
}
