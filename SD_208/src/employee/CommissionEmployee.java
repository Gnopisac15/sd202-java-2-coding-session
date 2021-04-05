/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 2ndyrGroupB
 */
public class CommissionEmployee extends Employee {
    private int totalSales;
    
    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, MyName empName, Date dataHired) {
        super(empID, empName, dataHired);
    }
    
    public CommissionEmployee(int empID, MyName empName, Date dataHired,int totalSales) {
        super(empID, empName, dataHired);
        this.totalSales = totalSales;
    }

   

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public int getTotalSales() {
        return totalSales;
    }
    

  
    public  double computeSalary(){
        double sales=0;
      if (totalSales <= 10000){
          sales = totalSales * 0.1;
      }else if(totalSales >10000 && totalSales <100000){
          sales = totalSales * 0.2;
      }else if (totalSales > 100000){
          sales = totalSales * 0.25;
      }
      return sales;
    }

    @Override
    public void displayDetails() {
        System.out.print("Commission Employee \n");
        super.displayDetails();
        System.out.println("Total Sales: "+ this.getTotalSales());
        System.out.println("Salary :" +Math.round(computeSalary())+"\n");
        //To change body of generated methods, choose Tools | Templates.
    }
   
}
