package brness;

public class Test {
    public static void main(String[] args) {

        for (int i=2;i<=1000;i++){
            boolean flag=true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(i+" ");
        }
    }
}
