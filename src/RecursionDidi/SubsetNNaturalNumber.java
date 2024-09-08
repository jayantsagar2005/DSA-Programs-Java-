package RecursionDidi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        printSubset(n, list);
    }

    public static void printSubset(int n, ArrayList<Integer> list) {
        if(n == 0){
            System.out.println(list);
            return;
        }
        printSubset(n-1, list);

        list.add(n);
        printSubset(n-1, list);

        list.remove(list.size()-1);
    }
}
