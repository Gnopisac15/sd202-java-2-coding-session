/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise05;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        palindrome(num);
        
    }
  static void palindrome(int num){
        int remainder,reverseInt=0;
        int original = num;
        for (;num!=0;num/=10){
            remainder = num%10;
            reverseInt =  reverseInt * 10+remainder;
        }
        if(original == reverseInt){
            System.out.println("Palindrome");            
        }else{
            System.out.println("Not palindrome");           
        }
    
    }
}
