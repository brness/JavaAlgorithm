package brness.pac6.OneDimensionArray;

public class Test {
    public static void main(String[] args) {
        int x=1;
        int[] y=new int[10];

        m(x,y);

        System.out.println("x is "+x);
        System.out.println("y[0] is "+y[0]);//由于numbers与y指向同一个数组，所以numbers改变y也变
    }

    public static void m(int number,int[] numbers){//这里是void，所以number改变不影响x
        number=1001;
        numbers[0]=5555;
    }
}
