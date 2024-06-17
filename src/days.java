import java.util.Scanner;

public class days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the second : ");
        int sec = sc.nextInt();

        int hour =  sec/3600;
        sec = sec%3600;

        int minute = sec/60;
        sec = sec%60;

        System.out.println("Hour : "+hour);
        System.out.println("Minute : "+minute);
        System.out.println("Second : "+sec);
    }
}
