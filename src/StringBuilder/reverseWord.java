package StringBuilder;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i=0; i<sb.length(); i++){

            int j = i;

            while(j<sb.length() && sb.charAt(j) != ' '){
                j++;
            }

            int k = j-1;

            while (i<k){
                char ch1 = sb.charAt(i);
                char ch2 = sb.charAt(k);

                char temp = ch1;
                sb.setCharAt(i,ch2);
                sb.setCharAt(k,ch1);
                i++;
                k--;
            }

            i = j;


        }

        System.out.println(sb);


    }
}
