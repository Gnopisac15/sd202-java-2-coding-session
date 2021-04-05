package pn202.section;

import java.util.Random;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;
    public Random rand = new Random();
    
    public void displayNameTotal(String name, double price) {
        //System.out.println(name + " will pay " + (price * (1+tax+tip)));
        //System.out.println(String.format("%-10s will pay Php %-10.2f", name, price * (1.+tax+tip)));
        System.out.printf("%-10s will pay Php %-10.2f\n", name, price * (1.+tax+tip));
        
    }
    
    public int generateNumber() {
        return rand.nextInt();
    }
    
    public void drawBaby() {
        System.out.println("(_)");
        System.out.println("\\|_");
        System.out.println(" |");
        System.out.println("/ \\");
    }
}
