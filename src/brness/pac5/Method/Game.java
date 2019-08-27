package brness.pac5.Method;

public class Game {
    public static void main(String[] args) {
        int t = 0;
        for (int i = 0; i < 10000; i++) {
            int x = (int) (Math.random() * 6) + 1;
            int y = (int) (Math.random() * 6) + 1;
            System.out.println("you rolled " + x + "+" + y);
            if (x + y == 2 || x + y == 3 || x + y == 12) {
                t++;
                System.out.println("you win");
            } else if (x + y == 7 || x + y == 11)
                System.out.println("you lose");
            else
                while (true) {
                    System.out.println("your points is " + (x + y));
                    int k = over(x + y);
                    if (k == 1) {
                        System.out.println("you lose");
                        break;
                    } else if (k == -1) {
                        t++;
                        System.out.println("you win");
                        break;
                    } else
                        System.out.println("roll it again");
                }
        }
        System.out.println("winning times "+t);
    }
    public static int over(int x){
        int a=(int)(Math.random()*6)+1;
        int b=(int)(Math.random()*6)+1;
        System.out.println("you rolled "+a+"+"+b);
        if(a+b==7)
            return 1;
        if(a+b==x)
            return -1;
        else
            return 0;

    }
}
