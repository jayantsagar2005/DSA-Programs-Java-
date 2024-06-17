package String;

public class ReverseWord {

    public static String reversePrefix(String word, char ch) {

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if(temp == ch){
                idx = i;
                break;
            }
        }

        for (int i=idx; i>=0; i--){
            sb.append(word.charAt(i));
        }

        for (int i=idx+1; i<word.length(); i++){
            sb.append(word.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "abcd";
        char ch = 'z';

        String ans = reversePrefix(str, ch);

        System.out.println(ans);
    }
}
