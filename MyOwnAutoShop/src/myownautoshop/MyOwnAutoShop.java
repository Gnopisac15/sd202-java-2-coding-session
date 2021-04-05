/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshop;

/**
 *
 * @author 2ndyrGroupB
 */
public class MyOwnAutoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here              
        Car t1 = new Truck(1000,400000,"Black",2000);
        t1.display();
        
        Car f1 = new Ford(1500,600000,"White",2021,20.2);
        f1.display();
        
        Car s1 = new Sedan (1900,2000000,"Blue",20);
        s1.display();
        
        System.out.println("--Display the all prices--"+"\nDisplay the sale price of Truck: "+t1.getSalePrice()+"\nDisplay the sale price of Ford: "+f1.getSalePrice()+"\nDisplay the sale price of Sedan: "+s1.getSalePrice());
        
        
    }
    
}
