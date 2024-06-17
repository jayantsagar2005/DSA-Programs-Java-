package LEETCODE_DSA;

public class lengthLastWord {

    public static int lengthLastWord(String str) {
        int i = 0;
        for (int j=0; j<str.length(); j++){

            if (str.charAt(j) == ' '){
                i = 0;
            }else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        String str = " fly me to the moon ";

        int result = lengthLastWord(str);
        System.out.println(result);
    }
}
