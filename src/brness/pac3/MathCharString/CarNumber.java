package brness.pac3.MathCharString;

public class CarNumber {
    public static void main(String[] args){
        System.out.println("The car number is :");
        for(int i=0;i<3;i++){
            char c1=(char)('A'+(int)(Math.random()*26));
            System.out.print(c1);
        }
        for(int i=0;i<4;i++){
            int n1=(int)(Math.random()*10);
            System.out.print(n1);
        }
    }
}
