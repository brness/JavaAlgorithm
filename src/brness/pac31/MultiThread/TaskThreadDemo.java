package brness.pac31.MultiThread;

public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA=new PrintChar('a',1000);
        Runnable printB=new PrintChar('b',1000);
        Runnable print100=new PrintNum(1000);

        Thread thread1=new Thread(printA);
        Thread thread2=new Thread(printB);
        Thread thread3=new Thread(print100);
        //thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class PrintChar implements Runnable{
    private char c;
    private int num;

    public PrintChar(){
    }

    public PrintChar(char c,int num){
        this.c=c;
        this.num=num;
    }

    public void run(){
        for(int i=0;i<num;i++)
            System.out.print(c);
    }
}

class PrintNum implements Runnable{
    private int num;

    public PrintNum(){}

    public PrintNum(int num){
        this.num=num;
    }

    public void run(){
        for(int i=0;i<num;i++){
            System.out.print((int)(Math.random()*101));
            //Thread.yield();用于将CPU时间给其他线程
        }
    }
}
