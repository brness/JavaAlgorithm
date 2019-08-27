package brness.pac19.Recursive;

public class BinarySearxh {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,8,12,14,15,16,35};
        int result=binarysearch(a,2);
        System.out.println("The result of the search is: "+result);
    }

    public static int binarysearch(int[] list,int key){
        int low=0;
        int high=list.length-1;

        while (low<=high){
            int mid=(high+low)/2;
            if(key<list[mid]){
                high=mid-1;
            }
            else if (key==list[mid])
                    return mid;
            else low=mid+1;
        }
        return -low-1;
    }
}
