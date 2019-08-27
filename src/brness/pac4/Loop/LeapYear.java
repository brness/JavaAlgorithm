package brness.pac4.Loop;

public class LeapYear {
    public static void main(String[] args) {
        int year=100;
        int k=0;
        while(year<=2100){
            if((year%4==0&&year%100!=0)||(year%400==0)){
                k++;
                System.out.print(year+" ");
                if(k%10==0)
                    System.out.println();
            }
            year++;
        }
    }
}
