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
public class Time {

    private int minute;
    private int hours;
    private int second;
    private int meridian;// 0 as AM; 1 as Noon; 2 as PM; 3 as Midnight

    public Time() {

    }

    public Time(int hours, int minute, int second) {
        this.setHour(hours);
        this.setMinute(minute);
        this.setSecond(second);
    }

    //Setter
    public void setHour(int hours) {
        this.hours = hours;

    }

    public void setMinute(int minute) {
        this.minute = minute;

    }

    public void setSecond(int second) {
        this.second = second;

    }

    //Getter
    public int getHour() {
        return hours;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Time(int hours, int minute, int second, int meridian) {
        this.minute = minute;
        this.hours = hours;
        this.second = second;
        this.meridian = meridian;
    }

    public void displayTime24() {
        System.out.printf("Time [hour:minute:second meridian]: %02d:%02d:%02d", hours, minute, second);
        getMeridian();

    }

    public int tickBySecond(int second) {
        this.second++;
        this.second = this.second + second;
       if (this.second % 60 == 0) {
            this.minute = (this.second / 60) + this.minute;
            this.second = this.second % 60;
            tickByMinute();
        } else if (this.second >59) {
            int min = this.second / 60;
            this.second = this.second % 60;
            this.minute = this.minute + min;          
            tickByMinute();
        }
        return this.second;
    }

    public int tickByMinute(int minute) {
        this.minute = this.minute + minute;
        if (this.minute > 59) {
            this.hours++;
            this.minute = this.minute - 60;
        } else {
            this.minute++;
        }
        return this.minute;
    }

   
    public int tickBySecond() {
        second++;
        if (this.second % 60 == 0) {
            this.minute = (this.second / 60) + this.minute;
            this.second = this.second % 60;
            tickByMinute();
        } else if (this.second >59) {
            int min = this.second / 60;
            this.second = this.second % 60;
            this.minute = this.minute + min;          
            tickByMinute();
        }
        return this.second;
    }

    public void tickByMinute() {
        if (this.minute % 60==0) {            
            this.minute = 0;
            tickByHours();            
        }else if (this.minute > 60){
            int hour = this.minute / 60;
            this.minute = this.minute % 60;            
            this.hours += hour -1;
            tickByHours();      
        }

    }

    public void tickByHours() {
        hours++;
        if (this.hours % 24==0) {
            this.hours = 0;
        }else if (this.hours > 24){
            int hour = this.hours % 24;
            this.hours = hour;
        }

    }

    public void getMeridian() {
            this.meridian = this.hours;
        if (this.meridian ==0 ) {
            System.out.printf(" Midnight ");
        }else if(this.meridian ==12){
            System.out.println(" NN ");
        }
        else if( this.meridian >= 1 && this.meridian<=11) {
            System.out.println(" AM ");

        }else{
            System.out.println(" PM ");
        }
    }

    @Override
    public String toString() {

        return String.format("%02d:%02d:%02d\n", hours, minute, second);
    }

}
