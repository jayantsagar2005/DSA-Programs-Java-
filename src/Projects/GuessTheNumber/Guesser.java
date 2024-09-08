package Projects.GuessTheNumber;

import java.util.Random;

public class Guesser {
    int guessNum;
     public int guesserNumber(){
         Random num = new Random();
         guessNum = num.nextInt(10);
//         guessNum = 5;
         return guessNum;
     }
}
