package brness.pac9.TheThinkingOfObject;

public class Prime {
    public static void main(String[] args) {
        StackOfInteger s=new StackOfInteger(16);
        for(int i=2;i<=120;i++){
            int p=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    p=0;
                }
            }
            if(p==1){
                s.push(i);
            }
        }

        while(!s.empty()){
            System.out.print(s.pop()+" ");
        }
    }
}
