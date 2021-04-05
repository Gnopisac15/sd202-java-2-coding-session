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
public class PieceWorkerEmployee extends Employee{
    private int totalPieceFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, MyName empName, Date dataHired,int totalPieceFinished, double ratePerPiece) {
        super(empID, empName, dataHired);
        this.totalPieceFinished = totalPieceFinished;
        this.ratePerPiece = ratePerPiece;
        
    }

    public PieceWorkerEmployee(int totalPieceFinished, double ratePerPiece) {
        this.totalPieceFinished = totalPieceFinished;
        this.ratePerPiece = ratePerPiece;
    }

    

    public int getTotalPieceFinished() {
        return totalPieceFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setTotalPieceFinished(int totalPieceFinished) {
        this.totalPieceFinished = totalPieceFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        double salary = totalPieceFinished * ratePerPiece;
        if(this.totalPieceFinished % 100 ==0){
            int bunos = this.totalPieceFinished /100;
            salary = salary+(bunos*(10 * ratePerPiece));
        }
     return salary;  
    }

    @Override
    public void displayDetails() {
       
        System.out.println("Piece Worker Employee ");
        super.displayDetails();
        System.out.println("Total Piece Finished: " + this.getTotalPieceFinished());
        System.out.println("Rate Per Piece: "+this.getRatePerPiece() );
        System.out.println("Salary :" +Math.round(computeSalary())+"\n");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
