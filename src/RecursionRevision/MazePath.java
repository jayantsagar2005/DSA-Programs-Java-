package RecursionRevision;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the column : ");
        int c = sc.nextInt();

        int ans = waysNumber(r, c);
        System.out.println("The total number of ways : "+ans);
    }

    public static int waysNumber(int r, int c) {
        if(r == 1 ||  c == 1){
            return 1;
        }

        return waysNumber(r-1,c) + waysNumber(r, c-1);


    }
}
