package brness.pac9.TheThinkingOfObject;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account[] x=new Account[10];
        for(int i=0;i<10;i++){
            x[i]=new Account();
            x[i].setId(i);
            x[i].setBalance(100);
        }

        System.out.println("Enter a ID: ");
        Scanner s=new Scanner(System.in);
        int id=s.nextInt();
        while (id>=0&&id<=9){
            System.out.println("Main Menu");
            System.out.println("1:check balance");
            System.out.println("2:withdraw");
            System.out.println("3:deposit");
            System.out.println("4:exit");
            System.out.println("Enter a choice:");
            int c=s.nextInt();
            while(c!=4) {
                if (c == 1) {
                    System.out.println("The balance is " + x[id].getBalance());
                }
                if (c == 2) {
                    System.out.println("Enter an amount to withdraw: ");
                    double withdraw = s.nextDouble();
                    x[id].withdraw(withdraw);
                }
                if (c == 3) {
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = s.nextDouble();
                    x[id].deposit(deposit);
                }
                System.out.println("Main Menu");
                System.out.println("1:check balance");
                System.out.println("2:withdraw");
                System.out.println("3:deposit");
                System.out.println("4:exit");
                System.out.println("Enter a choice:");
                c=s.nextInt();
            }
            System.out.println("Enter a ID: ");
            id=s.nextInt();
        }
    }
}
