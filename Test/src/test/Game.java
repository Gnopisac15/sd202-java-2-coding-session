/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Game {

    public static final String[] nameList = {
        "KERWEIN",
        "JUNMAR",
        "JUAN",
        "REHNAN",
        "MARTIN",
        "DAVID",
        "ABDUL",
        "RESTITUTO",
        "DEXTER",
        "JOSHUA",
        "JOSELITO",
        "JOHN",
        "MElCHOR"
    };
    public static final String[] hintList = {
        "Bansay",
        "Pina ka bansay sa tanan",
        "Gwapong Bata",
        "Pina ka Gwapong bata",
        "But-an na bata",
        "Manyakis",
        "Bahog lobot",
        "Boy Hukad",
        "Chickz boy",
        "Mamayotay",
        " Batang IRO",
        "Bugoy",
        "Pinaka Bugoy"
    };
    public static int count = 0;

    public static final Random RANDOM = new Random();
    static final Scanner input = new Scanner(System.in);

    public int randomGuess(int name) {
        return RANDOM.nextInt(name);
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
            if (word.charAt(i) == guess) {
                guessList[i] = retVal = true;
            }

        }
        return retVal;
    }

    public boolean isWin(boolean[] guessList) {

        for (boolean val : guessList) {
            if (!val) {
                return false;
            }
        }
        return true;
    }

    public char guess() {
        String temp;
        System.out.print("Enter your guess: ");
        temp = input.nextLine().toUpperCase();

        return temp.charAt(0);
    }

    public static void bitayImage() {
        if (count == 0) {           
            System.out.println("    ___");
            System.out.println("   /   \\");
            System.out.println("  | @_@ |");
            System.out.println("   \\_ _/");
            System.out.println("    _|_");
            System.out.println("   / | \\");
            System.out.println("    / \\ ");
            System.out.println("   /   \\");
        }
        if (count == 1) {
            

            System.out.println("    ___");
            System.out.println("   /   \\");
            System.out.println("  |     |");
            System.out.println("   \\_ _/");
            System.out.println("    _|_");
            System.out.println("   / | \\");
            System.out.println("    / \\ ");
            System.out.println("   /   \\");
        }
        if (count == 2) {

            System.out.println("    ___");
            System.out.println("   /   \\");
            System.out.println("  |     |");
            System.out.println("   \\_ _/");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    / \\ ");
            System.out.println("   /   \\");
        }
        if (count == 3) {
 

            System.out.println("    ___  ");
            System.out.println("   /   \\");
            System.out.println("  |     |");
            System.out.println("   \\_ _/");
            System.out.println("     |");
            System.out.println("     |");
        }
        if (count == 4) {
   
            System.out.println("    ___");
            System.out.println("   /   \\");
            System.out.println("  |     |");
            System.out.println("   \\_ _/");
        }
        if (count == 5) {

            System.out.println("    ___");
            System.out.println("   /   \\");
            System.out.println("  |     |");
        }
        if (count == 6) {
            System.out.println("    ___");
        }
        

    }

}
