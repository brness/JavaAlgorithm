package brness.pac11.Exception;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.print(sum(new int[] {1,2,3,4,5}));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("\n"+e.getMessage());
            System.out.println("\n"+e.toString());

            System.out.println("\n Trace Info Obtained fro getStackTrace");
            StackTraceElement[] trace=e.getStackTrace();
            for(int i=0;i<trace.length;i++){
                System.out.println("Method "+trace[i].getMethodName());
                System.out.println("("+trace[i].getClassName()+":");
                System.out.println(trace[i].getLineNumber()+")");
            }
        }
    }

    private static int sum(int[] list){
        int re=0;
        for(int i=0;i<=list.length;i++){
            re+=list[i];
        }
        return re;
    }
}
