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
 class Student extends Person {
        public void sendEmail() {
            System.out.println(this + "Student sendEmail");
        }
    
        public void depositAllowance() {
            System.out.println(this + "Student depositAllowance");
            allowance += LIVING_COST;
        }
    }