package RecursionRevision;

import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the number of stairs : ");
        int n = sc.nextInt();

        int ans = stairWay(n);
        System.out.println("Number of stair ways : "+ans);
    }

    public static int stairWay(int n ) {
        if(n == 0 || n==1){
            return 1;
        }

        return stairWay(n-1) + stairWay(n-2);
    }
}
