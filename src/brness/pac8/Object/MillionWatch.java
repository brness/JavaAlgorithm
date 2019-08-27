package brness.pac8.Object;

public class MillionWatch {
    public static void main(String[] args) {
        int[] a=new int[10000];
        for(int i=0;i<10000;i++){
            a[i]=(int)(Math.random()*100000);
        }
        StopWatch sw=new StopWatch();
        sw.start();
        for(int i=0;i<10000;i++){
            int max=a[i];
            int p=i;
            for(int j=i;j<10000;j++){
                if(a[j]>max){
                    max=a[j];
                    p=j;
                }
            }
            int temp=a[i];
            a[i]=a[p];
            a[p]=temp;
        }
        sw.stop();
        Long time=sw.getElapsedTime();
        System.out.println("The elapsed time of the sort is "+time+" milliseconds");
    }
}

class StopWatch{
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime=new java.util.Date().getTime();
    }

    public void start(){
        startTime=new java.util.Date().getTime();
    }

    public void stop(){
        endTime=new java.util.Date().getTime();
    }

    public Long getElapsedTime(){
        return endTime-startTime;
    }
}
