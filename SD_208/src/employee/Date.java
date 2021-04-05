/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 2ndyrGroupB
 */
class Date {
    private int month;
    private int day;
    private int year;
    private final static String [] monthName = {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SET","OTC","NOV","DEC"};

    public Date() {
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public static String[] getMonthName() {
        return monthName;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", monthName[month],day,year);
    }
    
    
    
}
