package Function;

import java.util.Scanner;

public class squareN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        square(n);
    }

    public static void square(int n) {
        for (int i=1; i<=n; i++){
            System.out.println(i+"^2 = "+i*i);
        }
    }
}
