/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise04;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numInt = input.nextInt();
        multiplication(numInt);
    }
    public static void multiplication(int num){
        for (int i = 1,x = 1; i<=10;x++,i++){
            int temp = i * num;
            System.out.println( x + "*" + num + " = " + temp);
    }   
    
    }
}
