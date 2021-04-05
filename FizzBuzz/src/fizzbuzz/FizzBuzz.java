/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int countNum=0;
        int num = 10;
        for(int x =0;x<num;x++){
          countNum++;
          if(countNum%5==0 && countNum%2==0){
              System.out.println(countNum+" FIZZBUZZ");
          }else if (countNum%5==0){
              System.out.println(countNum+ " BUZZ");
          }else if (countNum%2==0){
              System.out.println(countNum +" FIZZ");
          }else{
              System.out.println(countNum+" _________");
          
          }
        
        }
        
    }
    
}
