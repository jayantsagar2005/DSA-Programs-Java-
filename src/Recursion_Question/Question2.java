package Recursion_Question;

//Calculate the number of ways in which a person can climb n stairs if he can take exactly 1, 2 or 3 steps at each level.


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the stair number : ");
        int n = sc.nextInt();

        int ans = stairWays(n);
        System.out.println(ans);

    }

    public static int stairWays(int n) {
        if(n==0){
            return 1;
        }
        if (n<0) {
            return 0;
        }

        return stairWays(n-1) + stairWays(n-2) + stairWays(n-3);
    }
}
