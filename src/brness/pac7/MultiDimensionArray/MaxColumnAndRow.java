package brness.pac7.MultiDimensionArray;

public class MaxColumnAndRow {
    public static void main(String[] args) {
        int[][] matrix=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=(Math.random()>0.5)?1:0;
            }
        }
        int[] row=new int[4];
        int[] column=new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matrix[i][j]==1)
                    row[i]++;
                if(matrix[j][i]==1)
                    column[i]++;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int maxRow=0;
        int maxColumn=0;
        int ro=0;
        int co=0;
        for(int i=0;i<4;i++){
            if(maxRow<row[i]){
                maxRow=row[i];
                ro=i;
            }
            if(maxColumn<column[i]){
                maxColumn=column[i];
                co=i;
            }
        }
        System.out.println("The largest row index: "+ro);
        System.out.println("The largest column index :"+co);
    }
}
