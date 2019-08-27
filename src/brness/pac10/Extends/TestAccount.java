package brness.pac10.Extends;

public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account();
        System.out.println(a1.toString());

        SavingAccount a2=new SavingAccount();
        System.out.println(a2.toString());

        CheckingAccount a3=new CheckingAccount(1,100);
        System.out.println(a3.toString());
    }
}
