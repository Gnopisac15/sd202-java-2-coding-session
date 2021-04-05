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
public class Ford extends Car {
    // attributes

    private int year;
    private double manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

// methodsn
    @Override
    double getSalePrice() {// From the salePrice computed from Car class, subtract the manufacturerDiscount.
       return super.getSalePrice()  - (super.getSalePrice()*(manufacturerDiscount/100)); 
        
    }
     public void display(){
       super.display();
       System.out.println("Year: "+this.year+"\nManufacturer Discount: "+manufacturerDiscount+"%\n");
    }
}
