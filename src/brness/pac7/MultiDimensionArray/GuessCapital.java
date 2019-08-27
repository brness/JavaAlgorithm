package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class GuessCapital {
    public static void main(String[] args) {
        String[][] et={{"Alabama","Montgomery"},{"Alaska","Juneau"},{"Arizona","Phoenix"}};
        int k=0;
        for(int i=0;i<et.length;i++){
            Scanner s=new Scanner(System.in);
            System.out.println("What's the capital of "+et[i][0]);
            if(s.nextLine().equals(et[i][1])){
                k++;
                System.out.println("Your answer is right");
            }
            else
                System.out.println("The correct answer should be "+et[i][1]);
        }
        System.out.println("The correct count is "+k);
    }
}
