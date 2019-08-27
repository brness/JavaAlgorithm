package brness.pac5.Method;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime number are :");
        PrintPrime(50);
    }

    //打印指定个数的素数
    public static void PrintPrime(int x){
        int k=0;
        int i=2;
        while(k<x){
            if(IsPrime(i)){
                k++;
                System.out.print(i+"\t");
                if(k%10==0)
                    System.out.println();
            }
            i++;
        }
    }

    //判断一个数是不是素数
    public static boolean IsPrime(int y){
        for(int j=2;j<y;j++){
            if(y%j==0){
                return false;
            }
        }
        return true;
    }
}
