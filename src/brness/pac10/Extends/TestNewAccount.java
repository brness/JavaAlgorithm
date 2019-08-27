package brness.pac10.Extends;

public class TestNewAccount {
    public static void main(String[] args) {
        NewAccount n=new NewAccount(1122,1000,"George");
        n.setAnnualInterestRate(0.0015);
        n.deposit(30);
        n.deposit(40);
        n.deposit(50);

        n.withdraw(5);
        n.withdraw(4);
        n.withdraw(2);

        System.out.println(n.toString());
    }
}
