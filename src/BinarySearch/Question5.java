package BinarySearch;

import java.util.Scanner;

//Given a number ‘n’. Predict whether ‘n’ is a valid perfect square or not

public class Question5 {

    public static boolean checkSquare(int n) {
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mid*mid == n){
                return true;
            }else if(mid*mid > n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the square : ");
        int n = sc.nextInt();

        boolean ans = checkSquare(n);

        System.out.println(ans);
    }
}
