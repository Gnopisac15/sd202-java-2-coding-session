/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise08;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise08 {

    final static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();
    }

    static void display() {
        System.out.print("Enter a number to display: ");
        int num = input.nextInt();

        System.out.println("1. ");
        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println("2. ");
        for (int i = 1; i <= num; i++) { 
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
