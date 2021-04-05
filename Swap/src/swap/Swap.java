/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Before Swapping \nValue of num1: "+num1+"\n"+"Value of num2: "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After Swapping \nValue of num1: "+num1+"\n"+"Value of num2: "+num2);
        
        
    }
    
}
