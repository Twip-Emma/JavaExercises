package ClassInfo;

class FindError1 {
    public static void main(String[] args) {
        try {
            char cA = 'B';
            char cB = 2 + '5';
            System.out.println("cA=" + cA + "\n" + "cB=" + cB + "\n");
            String s1 = "two" + "one";//错误一
            String s2 = "Hello \n world";
            System.out.println("s1=" + s1 + ",s2=" + s2);
            byte iB = 125;
            short iC = 1000;
            int iD = 10000;
            long iE = 1000;
            System.out.println("iB=" + iB + "\n" + "iC=" + iC + "\n" + "iD=" + iD + "\n" + "iE=" + iE + "\n");

            Demo1 de = new Demo2();
            System.out.println("Demo1.name=" + de.name + ",Demo1.id="  + "\n");
            //de.test();//没有这个方法
            Class.forName("demo.Demo1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean equals(Object o) {
        return true;
    }
}

class Demo1 {
    protected String name;
    String id;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
}

class Demo2 extends Demo1 {
    public void test() {
        System.out.println("Demo1.test()");
    }
}
