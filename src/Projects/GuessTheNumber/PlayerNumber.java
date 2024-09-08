package Projects.GuessTheNumber;

import java.util.Scanner;

public class PlayerNumber {
    int number;

    public int playerNumber(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the "+num+" player number : ");
        number = sc.nextInt();
        return number;
    }
}
