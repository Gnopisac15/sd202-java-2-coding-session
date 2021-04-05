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
public class Car {
    // attributes

    private  int speed;
    private double regularPrice;
    private String color;
    public Car(int speed,double regularPrice,String color){
    this.speed=speed;
    this.regularPrice=regularPrice;
    this.color=color;
    }
   // methods
    double getSalePrice(){
      return this.regularPrice;   
    }
    
    public void display(){
        System.out.println("Speed: "+this.speed+"\nRegular Price: "+this.regularPrice+"\nColor: "+this.color);
    }
}
