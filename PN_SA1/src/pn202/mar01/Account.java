package pn202.mar01;

public class Account {
    private int accNum;
    private Name accName;
    private MyDate accDateOpened;
    private MyDate birthDate;
    private double currentBalance;
    private double totalBalance;

    public Account(int accNum, Name accName, double balance) {
        this.accNum = accNum;
        this.accName = accName;
        this.currentBalance = this.totalBalance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public Name getAccName() {
        return accName;
    }

    public void setAccName(Name accName) {
        this.accName = accName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    
    
    // Display both the current and total balance
    public void checkBalance() {
    
    }
    
    // Amount to be withdrawn should be a multiple of 100 and it must not exceede 
    // your current balance
    public boolean withdraw(double amount) {
        return true;
    }
    
    //add amount to the total balance but not on the current balance
    public boolean deposit(double amount) {
        return true;
    }
    
    public boolean transfer(Account other, double amount) {
        return true;
    }
    
    public void displayAccountDetails(){
        System.out.println("ACCOUNT #: " + accNum);
        System.out.println("ACCOUNT NAME: " + accName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Total Balance: " + totalBalance);
    }
    
    
    /**
     * Overide toString()
     * Account Number: 1001
     * Account Name: Edrian B. Guanzon
     * Date Opened: MAR-01-2021
     * Birth Date: FEB-16-2000
     * Current Balance: Php 75,000.00
     * Total Balance: Php 75,0000.00
     */
    
    
}
