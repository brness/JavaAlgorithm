package brness.pac11.Exception;

public class Test {
    public static void main(String[] args) {
        try{
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException e){
            System.out.println("Runtime in main");
        }
        catch (Exception e){
            System.out.println("Exception in main");
        }
    }

    public static void method(){
        try{
            String s="abc";
            System.out.println(s.charAt(3));
        }catch (RuntimeException e){
            System.out.println("Runtime in method");
        }
        catch (Exception e){
            System.out.println("Exception in method");
        }
    }
}
