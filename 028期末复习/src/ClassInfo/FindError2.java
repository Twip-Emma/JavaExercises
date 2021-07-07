package ClassInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
public class FindError2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Parent p1, p2 = new Parent();
        Child c1 = new Child();
        Child c2 = c1;
        c2.test();
//        p1.test();
        c2=(Child)p2;
        c2.test();
        Class<?> t = Class.forName("ClassInfo.Parent");
        Field[] f = t.getDeclaredFields();
        List l = new ArrayList();
        l.add(new Integer("10"));
        l.add("abc");
        System.out.println((String)l.get(0));
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(arr[5]);
    }
}
class Parent{
    public void test() {}
}
class Child extends Parent{
    public void test() {}
}