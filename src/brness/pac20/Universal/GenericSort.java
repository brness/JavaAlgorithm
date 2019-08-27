package brness.pac20.Universal;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray={new Integer(2),new Integer(4),new Integer(3)};
        Double[] doubleArray={new Double(3.4),new Double(1.3),new Double(-22.1)};
        Character[] charArrays={new Character('a'),new Character('J'),new Character('r')};
        String[] strings={"Tom","Susan","Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArrays);
        sort(strings);

        printList(intArray);
        printList(doubleArray);
        printList(charArrays);
        printList(strings);
    }

    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;

        for(int i=0;i<list.length;i++){
            currentMin=list[i];
            currentMinIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(currentMin.compareTo(list[j])>0){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            list[currentMinIndex]=list[i];
            list[i]=currentMin;
        }
    }

    public static <E>void printList(E[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
