package brness.pac24.Sort;

public class CheckOrder {
    public static void main(String[] args) {
        String[] s={"das","das","qweqw","dasas","dasdqwwe","iowerj"};
        System.out.print(ordered(s));
    }

    public static boolean ordered(int[] list){
        for (int i=0;i<list.length-1;i++){
            if (list[i]>list[i+1])
                return false;
        }
        return true;
    }

    public static boolean ordered(int[] list,boolean ascending){
        if (ascending) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1])
                    return false;
            }
            return true;
        }
        else
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] < list[i + 1])
                    return false;
            }
        return true;
    }

    public static boolean ordered(double[] list){
        for (int i=0;i<list.length-1;i++){
            if (list[i]>list[i+1])
                return false;
        }
        return true;
    }

    public static boolean ordered(double[] list,boolean ascending){
        if (ascending) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1])
                    return false;
            }
            return true;
        }
        else
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] < list[i + 1])
                    return false;
            }
        return true;
    }

    public static <E extends Comparable<E>> boolean ordered(E[] list){
        for (int i=0;i<list.length-1;i++){
            if (list[i].compareTo(list[i+1])<0)
                return false;
        }
        return true;
    }

    public static <E extends Comparable<E>> boolean ordered(E[] list,boolean ascending){
        if (ascending) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1])>0)
                    return false;
            }
            return true;
        }
        else
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1])<0)
                    return false;
            }
        return true;
    }
}
