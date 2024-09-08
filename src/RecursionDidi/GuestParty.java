package RecursionDidi;

import java.util.Scanner;

public class GuestParty {

    public static int guestParty(int n) {
        if (n <= 1) return 1;
        int way1 = guestParty(n-1);
        int way2 = (n-1) * guestParty(n-2);
        return way2 + way1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        int ans = guestParty(n);

        System.out.println("Total numbers --> : "+ans);
    }
}
