/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itlognidexter;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class ItlogNiDexter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        variantOfEggs();

    }
    public static void nameC(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the name of custtomer: ");
         String name = input.nextLine();        
    }
    public static void variantOfEggs() {       
        Scanner input = new Scanner(System.in);        
        System.out.println("- Choice  variants of eggs -\n 1. Penoy - P12 \n 2. Balut #16 - P15 \n 3. Balut #18 - P16 \n Choice a number: ");
        int num = input.nextInt();
        int total, numE = 0;
        String add;
        char ch;
        switch (num) {
            case 1:
                System.out.println("How many pieces of egg? ");
                numE = input.nextInt();
                total = numE * 12;
                System.out.println("Add another [C]customer or [E]eggs?");
                add = input.nextLine();
                ch = toUpperCaseadd.charAt(0);
                if(ch=='C')
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
