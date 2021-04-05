/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccounts;

/**
 *
 * @author 2ndyrGroupB
 */
public class Account {

    private int accNum;
    private Name accName;
    private MyDate accDateOpened;
    private MyDate birthDate;
    private double currentBalance;
    private double totalBalance;

    public Account() {

    }

    public Account(int accNum, Name accName, MyDate accDateOpened, MyDate birthDate) {
        this.setAccNum(accNum);
        this.setAccName(accName);
        this.setAccDateOpened(accDateOpened);
        this.setBirthDate(birthDate);

    }

    public Account(int accNum, Name accName, MyDate accDateOpened, MyDate birthDate, double currentBalance, double totalBalance) {
        this.accNum = accNum;
        this.accName = accName;
        this.accDateOpened = accDateOpened;
        this.birthDate = birthDate;
        this.currentBalance = currentBalance;
        this.totalBalance = totalBalance;
    }

    //Display both the current and total balance
    public void checkBalance() {
        System.out.print("Current balance: " + this.currentBalance + "\nTotal Balance: " + this.totalBalance + "\n");

    }

    //Amount to be withdrawn should be multipple of 100 and it should not exceed
    //your current balance
    public void withdraw(double amount) {
        if (amount % 100 == 0 && amount <= this.totalBalance) {
            this.currentBalance = totalBalance -= amount;
        } else {
            System.out.println("Invalid amount!");
        }

    }

    public double deposit(double amount) {
        return  this.totalBalance += amount;

    }

    public double transfer(Account otherAcc, double amount) {
        this.currentBalance = this.totalBalance -= amount;
        return otherAcc.totalBalance += amount;
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

    public MyDate getAccDateOpened() {
        return accDateOpened;
    }

    public void setAccDateOpened(MyDate accDateOpened) {
        this.accDateOpened = accDateOpened;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
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

    public void displayDetails() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Name: " + accName);
        System.out.println("Date Opened: " + accDateOpened);
        System.out.println("BirthDate: " + birthDate);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Total Balance: " + totalBalance+"\n");
    }
    //Override toString()
    //Account Number: 1001
    //Account Name: Edrian B. Guanzon
    //Date Opened: MAR-01-2021
    //BirthDate" FEB-01-2001
    //CurrentBalance: Php 75,000.00
    //TotalBalance: Php 75,000.00

}
