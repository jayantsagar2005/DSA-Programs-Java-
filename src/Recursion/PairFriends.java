package Recursion;

import java.util.Scanner;

public class PairFriends {
        public static int countWays(int n) {
            if (n <= 2) return n;
            return countWays(n - 1) + (n - 1) * countWays(n - 2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of friends : ");
            int n = sc.nextInt();
            System.out.println(countWays(n));
        }
}
