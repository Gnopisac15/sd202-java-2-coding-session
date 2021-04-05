
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party

        
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
      Calculator clac = new Calculator();
      clac.findTotal(10,"Peron 1");
      clac.findTotal(12, "Person 2");
      clac.findTotal(9, "Person 3");
      clac.findTotal(8, "Person 4");
      clac.findTotal(7, "Person 5");
      clac.findTotal(15, "Person 6");
      clac.findTotal(11, "Person 7");
      clac.findTotal(30, "Person 8");        
    }
}
