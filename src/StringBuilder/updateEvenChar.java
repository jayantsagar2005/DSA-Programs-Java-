package StringBuilder;

import java.util.Scanner;

public class updateEvenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        String  s = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (i%2==0){
                s = s + 'a';
            }else{
                s = s + ch;
            }
        }

        str = s;
        System.out.println(str);
    }
}
