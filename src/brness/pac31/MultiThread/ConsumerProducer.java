package brness.pac31.MultiThread;

import sun.awt.windows.ThemeReader;
import sun.nio.cs.ext.MacArabic;

import java.nio.Buffer;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducer {
    private static Buffer buffer=new Buffer();

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);//创建两个线程
        executorService.execute(new ProducerTask());
        executorService.execute(new ConsumerTask());
        executorService.shutdown();
    }

    private static class ProducerTask implements Runnable{
        public void run(){
            try {
                int i=1;
                while (true){
                    System.out.println("Producer writes "+i);
                    buffer.write(i++);

                    Thread.sleep((int)(Math.random()*10000));
                }
            }catch (InterruptedException e){}
        }
    }

    private static class ConsumerTask implements Runnable{
        public void run(){
            try {
                while (true){
                    System.out.println("\t\t\t\t\tConsumer reads "+buffer.read());
                    Thread.sleep((int)(Math.random()*10000));
                }
            }catch (InterruptedException e){}
        }
    }

    private static class Buffer{
        private static final int CAPACITY=1;
        private LinkedList<Integer> queue=new LinkedList<>();
        private static Lock lock=new ReentrantLock();//创建一个锁
        private static Condition notEmpty=lock.newCondition();//创建锁上的条件，用于线程之间的同步
        private static Condition notFull=lock.newCondition();

        public void write(int value){
            lock.lock();
            try {
                while (queue.size()==CAPACITY){
                    System.out.println("Wait for notFull condition");
                    notFull.await();
                }
                queue.offer(value);
                notEmpty.signal();
            }catch (InterruptedException e){}
            lock.unlock();
        }

        public int read(){
            int value=0;
            lock.lock();
            try {
                while (queue.isEmpty()){
                    System.out.println("\t\t\t\t\tWaiting for notEmpty condition");
                    notEmpty.await();
                }
                value=queue.remove();
                notFull.signal();
            }catch (InterruptedException e){}

            lock.unlock();
            return value;
        }
    }
}
