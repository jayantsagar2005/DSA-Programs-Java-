package RecursionDidi;

public class FirstAndLastOccurance {

    static int first = -1;
    static int last = -1;
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        helper(str, 0, 'a');
        System.out.println(first);
        System.out.println(last);
    }

    public static void helper(String str, int i, char ele) {
        if (i == str.length()) return;
        char ch = str.charAt(i);
        if(ch == ele){
            if(first == -1){
                first = i;
                last = i;
            }else {
                last = i;
            }
        }
        helper(str, i+1, ele);
    }



}
