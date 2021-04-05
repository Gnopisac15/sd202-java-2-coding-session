/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccounts;

/**
 *
 * @author 2ndyrGroupB
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
          Account b = new Account();
          Account a = new Account(1002,new Name("Mr","Melchor","S.","Casipong"),new MyDate(1,16,2026),new MyDate(1,16,1962));          
          
          a.deposit(1000);
          a.transfer(b, 500); 
          a.withdraw(200);
          a.deposit(500);
          a.displayDetails();
               
          b.setAccNum(5);
          b.setAccName(new Name("Mrs.","MerLita","C","Casipong"));
          b.setAccDateOpened(new MyDate(5,6,153));
          b.setBirthDate(new MyDate(3,5,1972));
          
          b.displayDetails();
          b.checkBalance();
          
//         MyDate date = new MyDate();
//         date.setDay(5);
//         date.setMonth(5);
//         date.setYear(1995);
//         date.displayDate();
          
          

         
       
          
                 
    
    }
    
}
