/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pn202.mar01;

/**
 *
 * @author DCISM_REX
 */
public class TestAccount {
    public static void main(String []args) {
        Account[] accounts = new Account[10];
        Account a = new Account(1001, new Name("Leslie", "Avenido"), 10000);
        
        a.displayAccountDetails();
        System.out.println(a.getAccName().getFirstName());
        System.out.println(a);
    }
}
