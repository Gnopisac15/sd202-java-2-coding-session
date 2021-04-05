package tip04;

public class Calculator {

    public double tax = .05;
    public double tip = .15;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name) {
        double total = price * (1 + tax + tip);
        System.out.println((name + ": $" + Math.round((total) * 10) / 10.0) + "        [Original : " + price + "   Tax : " + tax + "   Tip : " + tip+"]");

    }
}