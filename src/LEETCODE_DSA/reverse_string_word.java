package LEETCODE_DSA;

public class reverse_string_word {
    public static void main(String[] args) {
        String str = "  hello world  ";

        String result = reverseStringWord(str);
        System.out.println(result);

    }

    public static String reverseStringWord(String str) {
        StringBuilder sb = new StringBuilder("");
        int i = str.length()-1;
        while (i>=0){
            while (i>=0 && str.charAt(i) == ' '){
                i--;
            }
            if (i<0){
                break;
            }
            int j = i;
            while (i>=0 && str.charAt(i) != ' '){
                i--;
            }
            if (sb.isEmpty()){
                sb = sb.append(str.substring(i+1,j+1));
            }else{
                sb = sb.append(" "+ str.substring(i+1,j+1));
            }

        }
        return sb.toString();
    }
}
