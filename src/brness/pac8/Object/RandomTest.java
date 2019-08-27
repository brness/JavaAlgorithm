package brness.pac8.Object;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random1=new Random(1000);
        for(int i=0;i<50;i++){
            System.out.println(random1.nextInt(100));
        }
    }
}
