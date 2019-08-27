package brness.pac31.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
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

    private static class Account{
        private int balance=0;

        public int getBalance() {
            return balance;
        }

        public void deposite(int amount) {
//            int newBalance=balance+amount;
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){}

            balance=amount+balance;
        }
    }
}
