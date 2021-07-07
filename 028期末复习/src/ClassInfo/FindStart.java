package ClassInfo;

public class FindStart extends A {
    public static void main(String[] args) {
        System.out.println("开始运行主函数");
        A a = new A();
//        System.out.println("===========");
//        FindStart b =new FindStart();
    }
    static {System.out.println("有静态关键字");}
    {System.out.println("没有关键字");}
}
class A{
    private B bn1 =new B();
    static {System.out.println("A的静态");}
    A() {System.out.println("A构造方法");}
    {System.out.println("A内没有关键字");}
}
class B{
    B(){System.out.println("B构造方法");}
}