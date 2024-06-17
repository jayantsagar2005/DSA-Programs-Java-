package String;

public class CompressString {

    public static void main(String[] args) {

        String s = "aabccc";

        StringBuilder ans = new StringBuilder();

       int i = 0;
       int j = 0;

       while(j != s.length()){
           char ch = s.charAt(i);
           if(ch == s.charAt(j)){
               j++;
           }else{
               ans.append(ch);
               ans.append(j-i);
               i = j;
           }
       }

        ans.append(s.charAt(i));
        ans.append(j-i);

        System.out.println(ans);

    }


}
