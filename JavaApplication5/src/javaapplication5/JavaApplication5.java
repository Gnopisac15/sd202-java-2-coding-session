/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 2ndyrGroupB
 */
public class JavaApplication5 {
//    public static void displayDigits(int num) {
//        System.out.println(num+" add its digit");
//        while( num!=0){
//            System.out.println(num%10);
//            num /=10;
//        }
//    
//    }
//    public static void addNumber(int num2){
//        System.out.println("Sum of numbers: "+num2);
//        int sum=0;
//        while(num2!=0)
//       {
//           sum+=num2%10;
//           num2/=10;
//        }
//        System.out.println("Sum of digits of a number is "+sum);
//    
//    
//    }
//     public static void singleDigit(int num3){
//        System.out.println("Sum of numbers: "+num3);
//        int sum=0;
//       while(num3!=0)
//       {
//           sum+=num3%10;
//           num3/=10;
//        }
//        System.out.println("Sum of digits of a number is "+sum);
//         int d=0;
//       while(sum!=0)
//       {
//           d+=sum%10;
//           sum/=10;          
//        }
//            
//       int c=0;
//       while(d!=0)
//       {
//           c+=d%10;
//           d/=10;          
//        }
//       System.out.println("Final single digit: "+c); 
//    }
//    /**
//     * @param args the command line arguments
//     */

    public static void add(int a[], int item) {
        System.out.print("{");
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");

    }

    public static void main(String[] args) {
        // TODO code application logic here
//           displayDigits(123456);
//           addNumber(1234656);
//           singleDigit(888888);
        int a[] = {1, 2, 3, 4, 5};
        add(a, 2);

    }

}
