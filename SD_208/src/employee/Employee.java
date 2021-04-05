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
public abstract class Employee {

    private int empID;
    private MyName empName;
    private Date dateHired;

    public Employee() {
    }

    public Employee(int empID, MyName empName, Date dataHired) {
        this.empID = empID;
        this.empName = empName;
        this.dateHired = dataHired;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(MyName empName) {
        this.empName = empName;
    }

    public void setDataHired(Date dataHired) {
        this.dateHired = dataHired;
    }

    public int getEmpID() {
        return empID;
    }

    public MyName getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return dateHired;
    }

    public void displayDetails() {
        System.out.println("Employee ID Number: " + empID);
        System.out.println("Account Name: " + empName);
        System.out.println("Date Hired: " + dateHired);
    }
    public abstract double computeSalary();
}
