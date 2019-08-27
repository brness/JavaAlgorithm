package brness.pac31.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation {
    private static Account account=new Account();

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new DepositTask());
        executorService.execute(new Withdraw());
        executorService.shutdown();
        System.out.println("Thread 1\t\tThread 2\t\tBalance");
    }

    public static class DepositTask implements Runnable{
        public void run(){
            try {
                while (true){
                    account.deposit((int)(Math.random()*10)+1);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){}
        }
    }

    public static class Withdraw implements Runnable{
        public void run(){
            while (true){
                account.withdraw((int)(Math.random()*10)+1);
            }
        }
    }

    private static class Account{
        private static Lock lock=new ReentrantLock();

        private static Condition newDeposit=lock.newCondition();

        private int balance=0;

        public int getBalance(){
            return balance;
        }

        public void withdraw(int amount){
            lock.lock();
            try {
                while (balance < amount) {
                    System.out.println("\t\t\tWait for a deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("\t\t\t\tWithdraw " + amount + "\t\t\t" + getBalance());
            }catch (InterruptedException e){}
            lock.unlock();
        }

        public void deposit(int amount){
            lock.lock();
            try {
                balance+=amount;
                System.out.println("Deposit "+amount+"\t\t\t\t\t\t\t"+getBalance());
                newDeposit.signal();
            }
            finally {
                lock.unlock();
            }
        }
    }
}
