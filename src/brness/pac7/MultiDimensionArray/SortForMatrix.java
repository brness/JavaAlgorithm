package brness.pac7.MultiDimensionArray;

public class SortForMatrix {
    public static void main(String[] args) {
        int[][] m={{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        sort(m);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public static void sort(int[][] m){
        for(int i=0;i<m.length;i++){
            int min=m[i][0];
            int p=i;
            for(int j=i;j<m.length;j++){
                if((m[j][0]<min)//第一次筛选行元素较小的放前面
                        ||(m[j][0]==min&&m[j][1]<m[p][1])) {//第二次筛选出行元素相等，但是列元素小的放前面
                    p = j;
                    min = m[j][0];
                }
            }
            int temp=m[i][0];
            m[i][0]=m[p][0];
            m[p][0]=temp;
            int temp1=m[i][1];
            m[i][1]=m[p][1];
            m[p][1]=temp1;
        }

    }
}
