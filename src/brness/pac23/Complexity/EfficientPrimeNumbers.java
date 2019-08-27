package brness.pac23.Complexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
找到2到根号i之间的素数，判断其中的数字是不是这些数字的因子
 */
public class EfficientPrimeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Find all prime numbers<=n,enter n: ");
        int n=s.nextInt();

        //用于存储素数数组的ArrayList
        List<Integer> list=new ArrayList<>();

        final int NUMBER_PER_LINE=10;
        int count=0;
        int number=2;
        int squareRoot=1;

        System.out.println("The prime numbers are \n");

        while (number<=n){
            boolean isPrime=true;

            //用于寻找寻找大于根号i的最小的数值
            if(squareRoot*squareRoot<number)squareRoot++;

            //遍历素数数组，如果存在number整除的素数，那么他就不是素数
            for (int k=0;k<list.size()&&list.get(k)<=squareRoot;k++){
                if (number%list.get(k)==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                count++;
                list.add(number);
                System.out.print(number+"\t");
                if (count%NUMBER_PER_LINE==0){
                    System.out.println();
                }
            }
            number++;
        }

        System.out.println("The number of prime is "+count);
    }
}
