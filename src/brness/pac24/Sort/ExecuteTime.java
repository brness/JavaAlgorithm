package brness.pac24.Sort;


public class ExecuteTime {
    public static void main(String[] args) {
        System.out.println("数组大小\t选择排序\t冒泡排序\t快速排序\t堆排序");
//        for (int i=0;i<6;i++){
//            System.out.print(i*50000+"\t");
        Integer[] test=new Integer[50000];
        for (int i=0;i<50000;i++){
            test[i]=(int)(Math.random()*100000);
        }
        System.out.print(50000+"\t");
            long start=System.currentTimeMillis();
            selctionSort(test);
            long end=System.currentTimeMillis();
            System.out.print(end-start+"\t");

            long start1=System.currentTimeMillis();
            GeneralBubble.bubblesort(test);
            long end1=System.currentTimeMillis();
            System.out.print(end1-start1+"\t");

            long start2=System.currentTimeMillis();
            GeneralMergeSort.mergeSort(test);
            long end2=System.currentTimeMillis();
            System.out.print(end2-start2+"\t");

            long start4=System.currentTimeMillis();
            HeapSort.heapsort(test);
            long end4=System.currentTimeMillis();
            System.out.println(end4-start4+"\t");

            long start3=System.currentTimeMillis();
            GeneralQiuck.quickSort(test);
            long end3=System.currentTimeMillis();
            System.out.print(end3-start3+"\t");


        }
//    }

    public static <E extends Comparable<E>> void selctionSort(E[] list){
        for (int i=0;i<list.length;i++){
            E max=list[i];
            int index=i;
            for (int j=i;j<list.length-1;j++){
                if (list[j].compareTo(list[j+1])<0){
                    max=list[j+1];
                    index=j+1;
                }
            }
            list[index]=list[i];
            list[i]=max;
        }
    }
}
