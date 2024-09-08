package Projects.GuessTheNumber;

import java.util.Scanner;

public class Umpire {
    int guessNum;
    int player1Num;
    int player2Num;
    int player3Num;

    public void collectGuessNumber(){
        Guesser guesser = new Guesser();
        guessNum = guesser.guesserNumber();
        collectPlayer();
    }

    public void collectPlayer(){
        PlayerNumber player1 = new PlayerNumber();
        player1Num = player1.playerNumber(1);
        player2Num = player1.playerNumber(2);
        player3Num = player1.playerNumber(3);
        compare();
    }

    String[] name;
    int idx;
    public void compare(){
        name = new String[3];
        idx = 0;
        if(guessNum == player1Num){
            name[idx++] = "Player1";
        }
        if (guessNum == player2Num){
            name[idx++] = "Player2";
        }
        if(guessNum == player3Num){
            name[idx++] = "Player3";
        }
        result();
    }

    public void result(){
        if(idx == 0){
            System.out.println();
            System.out.println("Any player is not win this game!");
        }else{
            System.out.println();
            System.out.println("***********************");
            System.out.println();
            System.out.println("WINNER PLAYER NAME");
            System.out.println();
            for(int i=0; i<idx; i++){
                System.out.println(name[i]+" ");
            }
            System.out.println();
            System.out.println("Right number --> "+guessNum);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Press any number to re-run program");
        System.out.println("Press 0 into exit");
        System.out.print("Press your choice : ");
        int n = sc.nextInt();

        if(n!=0){
            new Umpire().collectGuessNumber();
        }else {
            System.out.println("Program successfully exit.");
        }

    }
}
