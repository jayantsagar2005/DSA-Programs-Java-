package StringBuilder;

import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i=0; i<sb.length(); i++){

            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if (ascii>=97 && ascii<=122){
                ascii = ascii - 32;
            }else if(ascii>=65 && ascii<=90){
                ascii = ascii + 32;
            }
            char c = (char) ascii;
            sb.setCharAt(i,c);
        }

        System.out.println(sb);
    }
}
