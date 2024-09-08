package RecursionDidi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the disks : ");
        int n = sc.nextInt();

        towerHanoi(n, "S", "H", "D");
    }

    public static void towerHanoi(int n, String src, String helper, String des) {
        if(n==0) return;
        towerHanoi(n-1, src, des, helper);
        System.out.println(src+" to "+des);
        towerHanoi(n-1, helper, src, des);
    }
}
