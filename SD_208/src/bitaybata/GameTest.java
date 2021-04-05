/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitaybata;

/**
 *
 * @author 2ndyrGroupB
 */
public class GameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int currentWordIndex;
        boolean endFirst;
        int win = 0;
        boolean[] guessList;
        Game g = new Game();
        int randomName;

        do {
            randomName = g.randomGuess(g.nameList.length);
            System.out.println("Level: " + (win + 1));
            currentWordIndex = randomName;
            guessList = new boolean[g.nameList[currentWordIndex].length()];
            System.out.println("Current Life Bitay Bata Game");
            g.bitayImage();
            endFirst = false;

            do {
                System.out.println("HINT: " + g.hintList[currentWordIndex]);
                g.displayCurrentWord(g.nameList[currentWordIndex], guessList);
                if (!g.checkGuess(g.nameList[currentWordIndex], guessList, g.guess())) {
                    g.count++;
                    if (g.count < 7) {
                        System.out.println("Wrong guess, try again.");
                    }
                    g.bitayImage();
                }
                if (g.count > 6 || g.isWin(guessList)) {
                    endFirst = true;
                }
            } while (!endFirst);
            if (g.count > 6) {
                System.out.println("Your loose... GAME OVER.");
                System.out.println("The word was " + g.nameList[randomName]);
            } else {
                System.out.println("You win!" + (++win) + " time(s). Lets play again. ");
            }

        } while (g.count != 6);

    }

}
