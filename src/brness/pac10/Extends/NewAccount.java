package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private String name;
    private ArrayList<Transaction> transactions;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public NewAccount(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
        transactions=new ArrayList<>();
    }

    public NewAccount(int id,double balance,String name){
        this.name=name;
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
        transactions=new ArrayList<>();
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
        transactions.add(new Transaction('W',money,balance,"withdraw "+money));
    }

    public void deposit(double money){
        balance=balance+money;
        transactions.add(new Transaction('D',money,balance,"deposit "+money));
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<transactions.size();i++){
            s=s+transactions.get(i).toString()+"\n";
        }
        return "id "+id+" balance "+balance+" Date "+dateCreated+"\n"+s;
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String discription;

    public Transaction(char type,double amount,double balance,String discription){
        date=new Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.discription=discription+" in "+date;
    }

    @Override
    public String toString() {
        return type+" "+amount+" in "+date+" balance: "+balance;
    }
}
