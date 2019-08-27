package brness.pac4.Loop;

public class PrimeNumber {
    public static void main(String[] args) {
        int i=0;
        int k=2;
        while(i<50){
            int flag=0;
            for(int j=2;j<=k/2;j++){
                if(k%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                i++;
                System.out.print(k+"\t");
                if(i%10==0)
                    System.out.println();
            }
            k++;
        }
    }
}
