/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author 2ndyrGroupB
 */
public class MyTime {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t1 = new Time(); 
        Time t2 = new Time(11,59,9);
//        t1.tickBySecond();
//        t1.tickByMinute(9);
//        t1.tickByHours(3);
//        t1.displayTime24();
          t1.setHour(1);
          t1.setMinute(59);
          t1.setSecond(129);
          t1.tickBySecond();
          t1.displayTime24();
          
          t2.tickBySecond(120);
          t2.displayTime24();
    }
    
}
