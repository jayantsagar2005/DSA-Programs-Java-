package String;

import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        int count = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (vowelCount(ch)){
                count++;
            }
        }

        System.out.println("This string total vowel is : "+count);
    }

    public static boolean vowelCount(char ch) {
        if (ch=='a' || ch=='A'){
            return true;
        }
        if (ch=='e' || ch=='E'){
            return true;
        }
        if (ch=='i' || ch=='I'){
            return true;
        }
        if (ch=='o' || ch=='O'){
            return true;
        }
        if (ch=='U' || ch=='u'){
            return true;
        }

        return false;
    }
}
