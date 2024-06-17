package Function;

import java.util.Scanner;

public class areaCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();

        double area = areaOfCircle(r);

        System.out.println("The area of circle is : "+area);
    }

    public static double areaOfCircle(int r) {
        final double pi = 3.14;

        double area = pi * r * r;

        return area;

    }


}
