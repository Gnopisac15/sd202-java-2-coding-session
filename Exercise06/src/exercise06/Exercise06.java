/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a interger number from 1 to 100: ");
        int num = input.nextInt();
        fizzBuzz(num);
    }

    static void fizzBuzz(int num) {
        if (num <= 100) {
            for (int i = 1; i <= num; ++i) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i+" =>"+" FIZZ BUZZ");
                } else if (i % 3 == 0) {
                    System.out.println(i+" =>"+" FIZZ");
                } else if (i % 5 == 0) {
                    System.out.println(i+" =>"+" BUZZ");
                } else {
                    System.out.println(i+" =>"+" <(^_^)>");
                }
            }
        }else{
               System.out.println("Invalid number. You enter an integer number from 1 to 100."); 
        }
    }
}
