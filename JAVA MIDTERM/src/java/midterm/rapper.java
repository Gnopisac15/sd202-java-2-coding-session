/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.midterm;

/**
 *
 * @author 2ndyrGroupA
 */
//ENCAPSULATIONS
public class rapper  extends ABSTRACTION{
    
     public void vendortalent() {
    // The body of animalSound() is provided here
    System.out.println("I am a vendor and I can : rap" +" //ABSTRACTION");
  }
     
   private String name;
   private int age;
   doctor doc;
   
   
   public void rap(){
       System.out.println("I can rap : //Inheritance");
   }
   
   
   //OVERLOADING
   public void rapperage(String name,int age){ 
       System.out.println("My name is "+ name +" my age is "+age +"//Inheritance");
   }
   public void rapperage(String name,int age,String hobby){
   //////////////////////
   
   }
   
   //ENCAPSULATION
   public String Getname(){
       return name;
   }
   public void Setname(String Rappername){
      name = Rappername;
   }
   
   
   
}







