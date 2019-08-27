package brness.pac31.MultiThread;

public class Test implements Runnable{
    public static void main(String[] args) throws InterruptedException{
        new Test();
    }

//    public Test(){
//        Test task=new Test();//不停的在new Test();
//        new Thread(task).start();
//    }


    public Test() throws InterruptedException{
        Thread t=new Thread(this);
        t.start();
        t.sleep(1000);
    }
    public synchronized void run(){
        System.out.println("test");
    }
}
