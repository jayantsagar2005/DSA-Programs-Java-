package RecursionRevision;

import java.util.Scanner;

public class FindPowerLogarithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        long a = sc.nextInt();


        System.out.print("Enter the power : ");
        long b = sc.nextInt();

        long ans = power(a, b);
        System.out.println("Answer is : "+ans);
    }

    public static long power(long a, long b) {
        if (a == 0){
            return 0;
        }
        if(b == 0){
            return 1;
        }

        long temp = power(a,b/2);
        if(b%2 == 0){
            return temp * temp;
        }else{
            return temp * temp * a;
        }



    }
}
