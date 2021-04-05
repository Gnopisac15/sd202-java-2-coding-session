/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Exercise07 {

    final static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--Select number to convert--\n1. Fahrenheit to Celsius\n2. Inches to Meters\n3. Minutes to Year and Days");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        converting(num);

    }
    static void converting(int num) {
        double num1, result = 0;
        switch (num) {
            case 1:
                System.out.print("Enter the fahrenheit to convert celsius: ");
                num1 = input.nextDouble();
                result = (num1 - 32) * 5 / 9;
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.print("Enter the inches to convert into meters: ");
                num1 = input.nextDouble();
                result = num1 / 39.37;
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.println("Enter number of minutes: ");
                num1 = input.nextInt();
                int year = num / 525600;
                int day = num / 1440;
                System.out.println(year + " years " + day + " days");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }

}
