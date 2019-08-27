package brness.pac20.Universal;

public class BinarySearch {
    public static void main(String[] args) {
        String[] a={"qwer","waer","weafr","wefa","wrae"};
        Double[] b={new Double(1),new Double(2),new Double(5),new Double(7)};

        System.out.println(binary(b,Double.valueOf(5)));
        System.out.println(binary(a,"wrae"));
    }

    public static <E extends Comparable<E>> int binary(E[] list,E key){
        int low=0;
        int high=list.length-1;
        while (low<=high){
            int mid=(high+low)/2;
            if(list[mid].compareTo(key)>0)
                high=mid-1;
            else if (list[mid].compareTo(key)==0)
                return mid;
            else low=mid+1;
        }
        return -low-1;
    }
}
