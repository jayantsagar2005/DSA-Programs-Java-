package RecursionRevision;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        print(n,1);
    }

    public static void print(int n, int i) {
        if(i>10){
            return;
        }
        System.out.println(n+" * "+i+" = "+n*i);
        print(n,i+1);
    }
}
