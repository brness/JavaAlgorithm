package brness.pac1.basic;

public class Print {
    public static void main(String[] args){
        System.out.println("a"+"\t"+"b"+"\t"+"pow(a,b)");
        for(int a=1;a<6;a++){
            System.out.println(a+"\t"+(a+1)+"\t"+Math.pow(a,a+1));
        }
    }
}
