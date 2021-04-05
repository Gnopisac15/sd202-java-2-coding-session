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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, MyName empName, Date dataHired) {
        super(empID, empName, dataHired);
    }
    
    public BasePlusCommissionEmployee(int empID, MyName empName, Date dataHired, int totalSales) {
        super(empID, empName, dataHired, totalSales);
    }

    

    public BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

   

    public double getBaseSalary() {
        return baseSalary;
    }

   

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    

    @Override
    public double computeSalary() {
        return super.computeSalary()+this.baseSalary; //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void displayDetails() {
        System.out.print("Base Plus ");
        super.displayDetails();
       
        //To change body of generated methods, choose Tools | Templates.
    }
  

 
    

    
}
