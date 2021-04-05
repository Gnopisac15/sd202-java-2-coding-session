
package tip04;

public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        //Name your friends
        calc.findTotal(10,"Junmar");
        calc.findTotal(10, "Junmar");
        calc.findTotal(12, "Martin");
        calc.findTotal(9,  "Kerwein");
        calc.findTotal(8,  "Juan");
        calc.findTotal(7,  "Rhenan");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "Gnopisac");
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       
    } 
}
