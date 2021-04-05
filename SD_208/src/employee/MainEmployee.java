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
public class MainEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeRoster empR = new EmployeeRoster();
        HourlyEmployee empH = new HourlyEmployee( 13,new MyName("Zackie","Razon","Casipong"),new Date(3,13,2013),50,45);        
        empR.addEmployee(empH);
        
        PieceWorkerEmployee empP = new PieceWorkerEmployee();
        empP.setEmpID(6);
        empP.setEmpName(new MyName("Patrick","Razon","Casipong"));
        empP.setDataHired(new Date(12,6,2011));
        empP.setTotalPieceFinished(500);
        empP.setRatePerPiece(5);
        empR.addEmployee(empP);
        
        
        
        
        CommissionEmployee empC = new CommissionEmployee(1, new MyName("Isaiah John Rein","Razon","Casipong"),new Date(12,1,2008));
        empC.setTotalSales(15000);
        empR.addEmployee(empC)
        
;        
        BasePlusCommissionEmployee empB = new BasePlusCommissionEmployee(11, new MyName("Pauleen Elizabeth","Razon","Casipong"),new Date(10,11,2012));
        empB.setBaseSalary(45);
        empB.setTotalSales(18000);
        empR.addEmployee(empB);
        
        empR.summary();
        
        

    
}
}
