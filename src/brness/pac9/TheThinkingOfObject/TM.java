package brness.pac9.TheThinkingOfObject;

public class TM {
    public static void main(String[] args) {
        Time t1=new Time();
        System.out.println("hour: "+ t1.getHour()+"minute: "+ t1.getMinute()+"second: "+ t1.getSecond());

        Time t2=new Time(555550000);
        System.out.println("hour: "+ t2.getHour()+"minute: "+ t2.getMinute()+"second: "+ t2.getSecond());
    }
}

class Time{
    private long hour;
    private long minute;
    private long second;

    public Time(){
        long totalMilliseconds=System.currentTimeMillis();
        long totalSeconds=totalMilliseconds/1000;
        second=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        minute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        hour=totalHours%24;
    }

    public Time(long elapsedTime){
        setTime(elapsedTime);
    }

    public Time(long hour,long minute,long second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elaspsTime){
        long totalSeconds=elaspsTime/1000;
        second=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        minute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        hour=totalHours%24;
    }
}