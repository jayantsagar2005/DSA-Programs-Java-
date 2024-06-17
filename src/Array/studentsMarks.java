package Array;

import java.util.Scanner;

public class studentsMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i=0; i<marks.length; i++){
            System.out.print("Enter the "+(i+1)+" Marks : ");
            marks[i] = sc.nextInt();
        }

        for (int i=0; i<marks.length; i++){
            if (marks[i]<35){
                System.out.println("Roll No."+(i+1)+" marks less than 35.");
            }
        }
    }
}
