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
public class Artist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //AGGREGATION
        doctor doc =new doctor();
        doc.show();
        
        //OVERLOADING
        POLYMORPHISM po= new POLYMORPHISM();
        po.show("police");
        
        
       ////////
       
        rapper rap = new rapper();
        Singer sing = new Singer();
         //INHERITANCE 
        rap.rap();
        sing.rap();
        rap.rapperage("migz", 10);
     
        //ENCAPSULATION
        rap.Setname("migz");
        System.out.println("RAPPER NAME"+ " "+rap.Getname() +"//ENCAPSULATION");
        
        //POLYMORPHISM
        //System.out.println("arwr");
        System.out.println(POLYMORPHISM.policerap("POLICE CAN RAP" +" "+"//POLYMORPHISM")); 
        
        
        //AGGREGATION
         AGGREGATIONPN pn = new AGGREGATIONPN("John"+"  /AGGREGATION");
         AGGREGATION a = new AGGREGATION(pn);
         
         System.out.println("PN STUDENTS NAME IS : "+a.pn.pnstudents);
         
         //ABSTRACION
         rap.vendortalent();
      
             
        }
        
    }
    


