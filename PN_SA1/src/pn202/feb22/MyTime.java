package pn202.feb22;

public class MyTime {

    private int hour;
    private int minute;
    private int second;
    private int meridian;

    public MyTime() {
        hour = 12;
        minute = 0;
        second = 0;
        meridian = 1;
    }

    public MyTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public MyTime(int hour, int minute, int second, int meridean) {
        this(hour, minute, second);
        this.meridian = meridean;
    }

    public void setHour(int hour) {
        this.hour = hour < 24 && hour >= 0 ? hour : 0;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute < 60 && minute >= 0 ? minute : 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second < 60 && second >= 0 ? second : 0;
    }

    public int getMeridian() {
        return meridian;
    }

    public void setMeridian(int meridian) {
        this.meridian = meridian;
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
    
    public void tickBySecond(){}
    public void tickBySecond(int seconds){}
    public void tickByMinute(){}
    public void tickByHour(){}

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
