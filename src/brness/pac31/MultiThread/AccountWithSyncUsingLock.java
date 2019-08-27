package brness.pac31.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSyncUsingLock {
    private static Account account=new Account();

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){
            executorService.execute(new AddAPennyTask());
        }

        executorService.shutdown();

        while (!executorService.isTerminated()){
        }

        System.out.println("What is the balance?"+account.getBalance());
    }

    private static class AddAPennyTask implements Runnable {
        public void run() {
            account.deposite(1);
        }
    }

    public static class Account{
        private static Lock lock=new ReentrantLock();
        private int balance=0;

        public int getBalance() {
            return balance;
        }

        public void deposite(int amount){
            lock.lock();
            try {
                int newBalance=balance+amount;
                Thread.sleep(5);
                balance=newBalance;
            }catch (InterruptedException e){}
            lock.unlock();
        }
    }
}
