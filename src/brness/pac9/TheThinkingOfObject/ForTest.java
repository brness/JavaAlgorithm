package brness.pac9.TheThinkingOfObject;

public class ForTest {
    public static void main(String[] args) {
        Account a=new Account(1122,20000);
        a.setAnnualInterestRate(0.0045);
        a.deposit(3000);
        a.withdraw(2500);
        System.out.println("The balance of the id is "+a.getBalance());
        System.out.println("The date of the id is "+a.getDateCreated());
    }
}
