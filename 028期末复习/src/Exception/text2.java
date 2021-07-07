package Exception;

public class text2 {
    public static void main(String[] args) throws MyException {
        int a=5;
        if(a==5){
            throw new MyException("嗷呜~");
        }else{
            System.out.println("成功");
        }
    }
}

class MyException extends Exception{
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}


