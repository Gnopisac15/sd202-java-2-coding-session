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
   class Staff extends Person {
        public void sendSMS() {
            System.out.println(this + "Staff sendSMS");
        }

        public void sendEmail() {
            System.out.println(this + "Staff sendEmail");
        }
    
        public String toString() {
            return "I am Staff: ";
        }
      
    }
