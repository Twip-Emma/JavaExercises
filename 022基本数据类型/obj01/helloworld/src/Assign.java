public class Assign {
    public static void main(String[] args) {
        // 1.Declare and Assign
        int a;
        a = 100;
        System.out.println("a=" + a);
        int b = 100;
        System.out.println("b=" + b);
        int c = a;
        System.out.println("c=" + c);

        // 2.boolean
        boolean flag1 = true;
        // boolean flag2 = 1;//【错误】这里是布尔变量，应该改成 = ture
        boolean flag2 = true;
        System.out.println("flag1=" + flag1 + " flag2=" + flag2);
        // 3.text type
        char cA = 'A';
        // char cB = "A";//【错误】双引号是字符串，单引号才是字符，
        char cB = 'A';
        char cC = 65;
        System.out.println("cA=" + cA + " cB=" + cB + " cC=" + cC);

        String s1 = "Hello world";
        String s2 = "Hello \n world";
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        // 4.integer type
        byte iA = 100;
        // byte iB = 200;//byte类型值域被定义为-128~127
        byte iB = (byte) 200;
        short iC = 1000;
        int iD = 10000;
        long iE = 1000;
        // int iF = 10000L;//long类型无法转成int类型
        long iF = 10000L;
        System.out.println("iA=" + iA + "\n" + "iC=" + iC + "\n" + "iD=" + iD + "\n" + "iE=" + iE + "\n");
        // 5.floating-point type
        float fA = 3.14F;
        float fB = 3.14F;// double类型无法转成float类型
        double fC = 3.14;
        double fD = 3.14D;
        double fE = 2E2;
        double fF = 123.4E+306D;
        System.out.println(
                "fA=" + fA + "\n" + "fC=" + fC + "\n" + "fD=" + fD + "\n" + "fE=" + fE + "\n" + "fF=" + fF + "\n");
        System.out.println(iB+","+iF+","+fB);
    }

}