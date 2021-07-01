package user;
//第六次实验。。。异常
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //第一题
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入一个分数");
            int point = sc.nextInt();
            if (point >= 0 && point <= 100) {
                System.out.println("成功！\n" + point);
            } else {
                throw new PointException("[错误]需要输入1-100之间的数字");
            }
        } catch (PointException err) {
            System.out.println(err.getMessage());
        }

        //第二题
        Scanner scTra = new Scanner(System.in);
        int aTra = scTra.nextInt();
        int bTra = scTra.nextInt();
        int cTra = scTra.nextInt();
        isTriangle(aTra, bTra, cTra);
    }

    public static void isTriangle(int a, int b, int c) {
        try {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("a,b,c可以构成三角形");
            } else {
                throw new IllegalArgumentException("a,b,c不能构成三角形");
            }

        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
    }
}
