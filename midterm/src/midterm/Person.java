/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author 2ndyrGroupB
 */
public class Person {
    static double LIVING_COST = 1000.0;
        double allowance;
        String cellPhoneNumber, emailAddresses[];

        Person() {
            this("0123456", LIVING_COST);
            //0123456 is the contact number for information desk
        }

        Person(String cellPhoneNumber, double allowance) {
            this.cellPhoneNumber = cellPhoneNumber;
            this.allowance = allowance;
        }

        public void setEmail(String email1){
            emailAddresses = new String []{ email1 };
        }
 
        public void setEmail(String email1, String email2){
            emailAddresses = new String []{ email1, email2 };
        }
 
        public void setEmail(String email1, String email2, String email3){
            emailAddresses = new String []{ email1, email2, email3 };
        }

        public void sendSMS() {
            System.out.println(this + "Person sendSMS");
            sendEmail();
        }

        public void sendEmail() {
            System.out.println(this + "Person sendEmail");
        }
 
        public String toString(){
            return "I am Person: ";
        }
         public static final Boolean checkPassword(String password){
            boolean result = false;
            return result;
        }
    
}
