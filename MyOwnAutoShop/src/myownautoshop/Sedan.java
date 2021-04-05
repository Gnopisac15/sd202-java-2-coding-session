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
public class Sedan extends Car {
//    attributes

    private int length;
// methods

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    double getSalePrice() {// If length > 20 feet, 5%discount else 10%discount.
        if (this.length > 20) {
            return super.getSalePrice() - (super.getSalePrice() * 0.05);
        } else {
            return super.getSalePrice() - (super.getSalePrice() * 0.10);
        }
    }
    public void display(){
        super.display();
        System.out.println("Length: "+this.length+"\nLength Discount: "+((this.length>20)?"5%":"10%")+ "\n");
    }
}
