package ClassInfo;

public class Analysis extends TT{
    private Demo d2 = new Demo("Analysis");
    static {System.out.println("Analysis的静态代码块");}
    public Analysis(String s) {System.out.println("Analysis的有参构造方法");}
    public Analysis() {System.out.println("Analysis的无参构造方法");}
    public void test(Analysis t) {System.out.println("Analysis的test(Analysis t)方法");}
    public void test(TT t) {System.out.println("Analysis的test(TT t)方法");}
    public static void main(String[] args) {
//        TT t = new Analysis("Test");
//        t.test(t);
//        Analysis a = (Analysis)t;
//        a.test(a);
    }
}
class TT{
    private Demo d1 = new Demo("TT");
    static {System.out.println("TT的静态代码块");}
    public TT() {System.out.println("TT的构造方法");}
    public TT(String s) {
        this();
        System.out.println("I'm" + s);
    }
    public void test(TT t) {System.out.println("TT的test(TT t)方法");}
}
class Demo{
    public Demo(String str){System.out.println(str+ "调用Demo的构造方法");}
}
