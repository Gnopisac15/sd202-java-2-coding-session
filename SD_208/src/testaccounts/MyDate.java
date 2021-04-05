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
public class MyDate {
   private int day;
   private int month;//0 - January; 11 - December
   private int year;
   private int hours;
   private int minutes;
   private int seconds;   
   private static final String[] monthName={" ","JAN","FEB","MAR", "APR", "MAY", "JUN", "JUL", "AUG", "OCT", "SET", "NOV", "DES"};
   
   
   //Create your constructr and overload them
   //Create your necessary setter and getter
   
   public MyDate(){
   
   }
   
   public MyDate(int month , int day , int year){
       this.setMonth(month);
       this.setDay(day);
       this.setYear(year);
       
   }
   
   public void setDay(int day){
       this.day = day;
       
   }
   public void setMonth(int month){
       this.month = month;
   }
   public void setYear(int year){
       this.year = year;
   }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
  
   
   
   void displayDate(){
       System.out.println(monthName[month]+"-"+day+"-"+year);
   }

   @Override
   public String toString() {
       return String.format("%s, %s, %s",monthName[month], day, year);
   }
    
    
}
