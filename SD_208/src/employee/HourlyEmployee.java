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
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee(int empID, MyName empName, Date dataHired, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, dataHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, MyName empName, Date dataHired ) {
        super(empID, empName, dataHired);
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

   

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public double computeSalary() {
        double overTimeSalary, finalSalary;
        if (this.totalHoursWorked > 40) {
            overTimeSalary = (this.ratePerHour * 1.5) * (this.totalHoursWorked - 40);
            finalSalary = overTimeSalary + (this.ratePerHour * 40);
        } else {
            finalSalary = this.totalHoursWorked * this.ratePerHour;
        }

        return finalSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hourly Employee ");
        super.displayDetails();
        System.out.println("Total Hours Worked: "+this.getTotalHoursWorked());
        System.out.println("Rate Per Hour: "+this.getRatePerHour());
        System.out.println("Salary :" + Math.round(computeSalary())+"\n");//To change body of generated methods, choose Tools | Templates.
    }

}
