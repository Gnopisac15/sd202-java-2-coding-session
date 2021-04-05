/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
            int num = input.nextInt();
       String s = String.valueOf(num);    
      for(int i =0;i<=s.length()-1;i++){
          System.out.println(s.charAt(i));
           
      }                 
      int sum=0;
       while(num!=0)
      {
           sum+=num%10;
           num/=10;
       }        System.out.println("Sum of digits of a number is "+sum);
              int d=0;       while(sum!=0)
       {
           d+=sum%10;          sum/=10;          
      }
    System.out.println("Sum of digits of a number is "+d); 
                   int c=0;
    while(d!=0)
       {
          c+=d%10;
          d/=10;          
       }
       System.out.println("Final single digit: "+c); 

       

    }

}
