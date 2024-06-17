package BinarySearch;

import java.util.Scanner;

//        You have n coins and you want to build a staircase with these coins. The staircase consists of k rows
//        where the ith row has exactly i coins. The last row of the staircase may be incomplete.

//        Given the integer n, return the number of complete rows of the staircase you will build.


public class Question6 {

    public static int completeRows(int n) {
        long low = 0;
        long high = (long) n;

        while(low <= high){
            long mid = low + (high - low) / 2;

            long k = mid * (mid + 1) / 2;

            if(k == n){
                return (int) mid;
            }else if(k < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return (int) high;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of coins  : ");
        int n = sc.nextInt();

        int ans = completeRows(n);

        System.out.println(ans);
    }
}
