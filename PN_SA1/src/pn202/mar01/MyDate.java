package pn202.mar01;

public class MyDate {
    private int date;
    private int month; /* 0 - January; 11 - December */
    private int year;
    private static final String[] monthName = {"JAN", "FEB"};
    
    //create your constructors and overload them
    //create your necessary setters and getters
    
    void displayDate(){
        // MAR-01-2021
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(month);
        sb.append("/");
        sb.append(date);
        sb.append("/");
        sb.append(year);
        
        return sb.toString();
    }
    
    
}
