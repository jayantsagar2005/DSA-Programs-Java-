package RecursionRevision;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        printBinaryString(n, "");
    }

    public static void printBinaryString(int n, String ans) {
        if(n == ans.length()){
            System.out.println(ans);
            return;
        }
        if (ans.isEmpty()){
            printBinaryString(n, ans+"0");
            printBinaryString(n, ans+"1");
        }else {
            char ch =  ans.charAt(ans.length()-1);
            if (ch == '1'){
                printBinaryString(n, ans+"0");

            }else{
                printBinaryString(n, ans+"0");
                printBinaryString(n, ans+"1");
            }
        }


    }
}
