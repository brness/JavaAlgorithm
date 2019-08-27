package brness.pac6.OneDimensionArray;

public class TestReverse {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};

        for(int i=0,j=list.length-1;i<list.length/2;i++,j--){
            int temp=list[i];
            list[i]=list[j];
            list[j]=temp;
        }
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]);
    }
}
