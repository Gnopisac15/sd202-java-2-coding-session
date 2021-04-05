
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator clac = new Calculator();
       clac.findTotal(10, "Person 1");
       clac.findTotal(12, "Person 2");
       clac.findTotal(9, "Person 3");
       clac.findTotal(8, "Person 4");
       clac.findTotal(7, "Person 5");
       clac.findTotal(15, "Person 6");
       clac.findTotal(11, "Person 7");
       clac.findTotal(30, "Person 8");
       
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

       
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
