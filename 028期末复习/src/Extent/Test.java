package Extent;

public class Test {
    public static void main(String[] args) {
        son cv = new son();
        cv.show();
    }
}

class parent{
    public void show(){
        System.out.println("我是父类");
    }
}

class son extends parent{
    public void show(){
        super.show();
        System.out.println("我是子类");
        System.out.println("我可以起飞");
    }
}
