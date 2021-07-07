package Exception;

public class ExceptionTry {
    public static void main(String[] args) {
        int a = 15;
        try{
            a++;
            a++;
            a++;
            int b = a/0;
            a++;
            a++;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println(a);
        }
    }
}
