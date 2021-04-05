package pn202.bata;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final Scanner INPUT = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    
    public int randomGuess(int size) {
        return RANDOM.nextInt(size);
    }

    public void displayCurrentWord(String word, boolean[] guessList) {
        for (int i = 0; i < word.length(); ++i) {
            System.out.print((guessList[i] ? word.charAt(i) : "_") + " ");
        }
        System.out.println("");
    }

    public boolean checkGuess(String word, boolean[] guessList, char guess) {
        boolean retVal = false;
        for (int i = 0; i < word.length(); ++i) {
            if (guess == word.charAt(i)) {
                guessList[i] = retVal = true;
            }
        }
        return retVal;
    }
    
    public boolean isWin(boolean []guessList) {
        for(boolean val: guessList) {
            if(!val) {
                return false;
            }
        }
        return true;
    }

    public char guess() {
        String temp;

        System.out.print("Enter your guess: ");
        temp = INPUT.nextLine();

        return temp.charAt(0);
    }
}
