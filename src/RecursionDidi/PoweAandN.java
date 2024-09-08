package RecursionDidi;

import java.util.Scanner;

public class PoweAandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int base = sc.nextInt();

        System.out.print("Enter the power : ");
        int pow = sc.nextInt();

        int ans = powerOf(base , pow);
        System.out.println("The ans is : "+ans);
    }

    public static int powerOf(int b, int p) {
        if(p == 1) return b;
        int n = powerOf(b, p/2);
        if(p % 2 == 0){
            return n * n;
        }else {
            return n* n * b;
        }
    }
}
