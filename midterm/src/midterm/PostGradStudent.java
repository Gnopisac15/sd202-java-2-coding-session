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
public class PostGradStudent extends Student {
    public void sendSMS() {
            super.sendSMS();
            System.out.println(this + "PostGradStudent sendSMS");
        }

        public void sendEmail() {
            System.out.println(this + "PostGradStudent sendEmail");
        }    
        public void depositAllowance() {
            System.out.println(this + "PostGradStudent depositAllowance");
            allowance += 2 * LIVING_COST;
        }
    
    
}
