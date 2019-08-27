package brness.pac25.MyList;

public class Prime50 {
    public static void main(String[] args) {
        int count=0;
        int num=2;
        GenericStack<Integer> stack=new GenericStack<>();
        while(count<50){
            boolean flag=true;
            for (int i=2;i<=num/2;i++){
                if (num%i==0){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                count++;
                stack.push(num);
            }
            num++;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
