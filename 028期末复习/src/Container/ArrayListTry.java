package Container;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListTry {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(5);
        a.add("8芜湖");
        a.add(16.7);
        for (Object o : a) {
            System.out.println(o);
        }
        a.set(2,99.8);
        for (Object o : a) {
            System.out.println(o);
        }
        HashSet<Object> b = new HashSet<>();
        b.add("你好");
        b.add(8.9);
        for (Object o : b) {
            System.out.println(o);
        }
    }
}
