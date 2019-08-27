package brness.pac11.Exception;
/*
注意一下，try-catch语句一旦出现异常，就直接跳入catch语句中，不再执行try中语句

 */
public class TestCircleWithException {
    public static void main(String[] args) {
        try{
            CircleWithException c3=new CircleWithException(-5);
            CircleWithException c1=new CircleWithException(5);
            CircleWithException c2=new CircleWithException(0);

        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }

        System.out.println("The number of objects created: "+CircleWithException.getNumberofObjects());
    }
}
