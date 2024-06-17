package RecursionRevision;

public class RemoveAString {
    public static void main(String[] args) {
        String str = "Jayant Kumar";

        removeA(str, 0);
    }

    public static void removeA(String s, int idx) {
        if (idx == s.length()){
            return;
        }

        char ch = s.charAt(idx);

        if (ch == 'a' || ch == 'A'){
            removeA(s, idx + 1);
        }else{
            System.out.print(ch);
            removeA(s, idx + 1);
        }

    }
}
