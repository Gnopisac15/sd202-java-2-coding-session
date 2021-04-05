package pn202.feb22;

public class Test {

    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(12, 59, 0);
        
        t2.displayTime24(); // 12:59:00
        t2.tickByMinute();
        t2.displayTime24(); // 13:00:00
        t2.tickBySecond(45);
        t2.displayTime24(); // 13:00:45
        t2.tickBySecond(45);
        t2.displayTime24(); // 13:00:46
        t2.tickBySecond(30);
        t2.displayTime24(); // 13:01:16
    }
}
