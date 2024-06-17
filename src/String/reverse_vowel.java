package String;

public class reverse_vowel {
    public static void main(String[] args) {

        String s = "hello";

        String result = reverseString(s);

        System.out.println(result);
    }

    public static String reverseString(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j =  array.length-1;
        String vowel = "aeiouAEIOU";

        while (i<j){
            while (i<j){
                char ch = array[i];
                if (vowel.indexOf(ch)!=-1){
                    break;
                }else {
                    i++;
                }
            }

            while (i<j){
                char ch = array[j];
                if (vowel.indexOf(ch)!=-1){
                    break;
                }else {
                    j--;
                }
            }

            if (i<j){
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return new String(array);
    }
}
