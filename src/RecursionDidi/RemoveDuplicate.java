package RecursionDidi;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "abbccda";
        boolean[] arr = new boolean[26];
        remove(str, arr, 0, "");
    }

    public static void remove(String str, boolean[] arr, int n, String ans) {
        if (n == str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(n);
        if(arr[ch-'a']){
            remove(str, arr, n+1, ans);
        }else{
            ans = ans+ch;
            arr[ch-'a'] = true;
            remove(str, arr, n+1, ans);
        }
    }
}
