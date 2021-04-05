/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberdenomination;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class NumberDenomination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any amount: ");
//        float num = input.nextFloat();
//        float money=0;
//        for (int i =0; i<=num;i++){
//            money = num/1000;
//            System.out.println("1000 =>"+Math.round(money)); 
//            break;    

//        Scanner input = new Scanner(System.in);
//        double n = input.nextFloat();
//
//        double count = 0;
//        int dom1[] = {1000, 500, 200, 20, 10, 5, 1};
//        for (int i = 0; i < 7; i++) {
//            count = n / dom1[i];
//            if (count != 0) {
//                System.out.println(dom1[i] + "=>" + Math.round(count));
//            } else {
//                System.out.println(dom1[i] + "=>" + Math.round(count));
//            }
//            n = n % dom1[i];
//        }
//
//        double dom2[] = {.25, .1, .01};
//        for (int i = 0; i < 3; i++) {
//            count = n / dom2[i];
//            if (count != 0) {
//                System.out.println(dom2[i] + "=>" + Math.round(count));
//            } else {
//                System.out.println(dom2[i] + "=>" + Math.round(count));
//            }
//            n = n % dom2[i];
//        }

        System.out.println("Enter any amount of money: ");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double temp;
        double[] arrnum = {1000, 500, 200, 20, 10, 5, 1, .25, .1};
        for (int i = 0; i < arrnum.length; i++) {
            if (num !=0) {
                temp = num / arrnum[i]; 
                num = num % arrnum[i];                
                System.out.println(arrnum[i] + "=>"+(int)temp);
            
            }
        } 
        
    }

}
