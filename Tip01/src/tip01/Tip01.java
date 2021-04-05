package tip01;

public class Tip01 {

    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        
         */
        double [] money = {10,12,9,8,7,15,11,30};
        totalTax(money);
    }

       public static void totalTax(double [] num){
        int person=1;
        for (int i = 0;i<num.length;i++,person++){          
            System.out.println("Person: "+person+"  $"+Math.round(num[i]*(1+.05+.15)*10)/10.0);            
        }
        
        
    
    }
}
