/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Palindrome {

    static boolean palindrome(int num) {

        int remainder, reversedInt = 0;
        int origInt = num;
        for (; num != 0; num /= 10) {
            remainder = num % 10;
            reversedInt =  (reversedInt * 10)+remainder;
        }
        if (origInt == reversedInt) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = input.nextInt();
        System.out.println(palindrome(num));

    }

}
