package brness.pac19.Recursive;

public class RecursiveSort {
    public static void main(String[] args) {
        int[] a={2,41,51,234,2,5,6,8,3,86,33,22};
        for (int i=0;i<a.length;i++){
            int min=a[i];
            int p=i;
            for(int j=i+1;j<a.length;j++){
                if (min>a[j]){
                    min=a[j];
                    p=j;
                }
            }

            int temp=a[i];
            a[i]=a[p];
            a[p]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
