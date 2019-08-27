package brness.pac9.TheThinkingOfObject;

import java.util.Date;
import java.util.GregorianCalendar;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public void withdraw(double money){
        balance=balance-money;
    }

    public void deposit(double money){
        balance=balance+money;
    }

}
