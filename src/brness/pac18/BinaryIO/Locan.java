package brness.pac18.BinaryIO;

import brness.pac8.Object.Date;

import java.io.*;

public class Locan {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("loan.dat"));
        Loan[] loans={new Loan(312.1,2,23),new Loan(23.1,12,123),
        new Loan(54.6,23,778),new Loan(123.4,57,834),
        new Loan(243.56,324,65)};
        objectOutputStream.writeObject(loans);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("loan.dat"));
        Loan[] temp=(Loan[]) objectInputStream.readObject();
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i].getNumerOfYears());
        }
    }
}

class Loan implements Serializable{
    private double annualInterestRate;
    private int numerOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }

    public Loan(double annualInterestRate,int numerOfYears,double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numerOfYears=numerOfYears;
        this.loanAmount=loanAmount;
        loanDate=new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumerOfYears() {
        return numerOfYears;
    }

    public void setNumerOfYears(int numerOfYears) {
        this.numerOfYears = numerOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
