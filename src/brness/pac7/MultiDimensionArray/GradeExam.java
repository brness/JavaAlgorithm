package brness.pac7.MultiDimensionArray;

import java.util.Arrays;

public class GradeExam {
    public static void main(String[] args) {
        char[][] Grades={
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}
        };
        int[] sum=new int[8];
        char[] grade={'D','B','D','C','C','D','A','E','A','D'};
        for(int i=0;i<Grades.length;i++){
            for(int j=0;j<Grades[i].length;j++){
                if(Grades[i][j]==grade[j])

                    sum[i]++;
            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
