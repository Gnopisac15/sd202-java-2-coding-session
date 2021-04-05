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
public class Truck extends Car {

    // attributes
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;

    }

    // methods
    // If weight > 2000, 10% discount else 20% discount.
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() - (super.getSalePrice() * 0.1);

        } else {
            return super.getSalePrice() - (super.getSalePrice() * 0.2);
        }

    }
     public void display(){
         super.display();
         System.out.println("Weight: "+this.weight+"\nWeight Discount: "+((this.weight>2000)?"10%":"20%") +"\n");
    }

}
