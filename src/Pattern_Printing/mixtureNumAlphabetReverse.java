package Pattern_Printing;

import java.util.Scanner;

public class mixtureNumAlphabetReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                if (i%2==0){
                    System.out.print((char) (j+64) + " ");
                }else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
