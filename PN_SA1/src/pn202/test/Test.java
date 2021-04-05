package pn202.test;

import pn202.bata.Game;
import pn202.mar01.Account;

public class Test {

    public static void main(String[] args) {
        String[] wordList = {"Godwin", "Shelley", "Leslie", "Garfield", "Alex"};
        String[] hintList = {"The almighty god.", "The brain and the beauty.",
            "The beauty.", "The beast.", "The giver."};
        int currentWordIndex;
        int life = -1;
        String lifeString = "BITAY";
        boolean[] guessList;
        boolean endFirst;
        int win = 0;
        Game g = new Game();

        do {
            System.out.println("Current Game: " + (win+1));
            currentWordIndex = g.randomGuess(wordList.length);
            guessList = new boolean[wordList[currentWordIndex].length()];
            endFirst = false;
            do {
                System.out.println("HINT: " + hintList[currentWordIndex]);
                g.displayCurrentWord(wordList[currentWordIndex], guessList);
                if (!g.checkGuess(wordList[currentWordIndex], guessList, g.guess())) {
                    System.out.println("Incorrect guess! ==> " + lifeString.substring(0, ++life + 1));
                }
                if (life >= 4 || g.isWin(guessList)) {
                    endFirst = true;
                }
            } while (!endFirst);
            if (life >= 4) {
                System.out.println("You loose... GAME OVER.");
            } else {
                System.out.println("You win " + (++win) + " time(s). Let's play again.");
            }
        } while (life != 4);
    }
}
