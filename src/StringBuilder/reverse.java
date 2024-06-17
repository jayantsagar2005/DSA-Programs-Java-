package StringBuilder;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        int j = sb.length()-1;

        while (i<j){
            char ch = sb.charAt(i);
            char ch1 = sb.charAt(j);

            char temp = ch1;

            sb.setCharAt(j,ch);
            sb.setCharAt(i,temp);

            i++;
            j--;
        }

        System.out.println();
        System.out.println(sb);
    }
}
