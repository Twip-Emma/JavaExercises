import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("输入数组长度：");
        Scanner scan = new Scanner(System.in);
        int arrlen = scan.nextInt();
        int[] arrUser = new int[arrlen];
        // 输入数组元素
        for (int i = 0; i < arrUser.length; i++) {
            arrUser[i] = scan.nextInt();
        }
        scan.close();

        //临时遍量判断是否有重复的
        int flag = 0;

        //遍历
        for (int arrItem = 0; arrItem < arrUser.length; arrItem++) {
            for (int arrItemOn = arrItem + 1; arrItemOn < arrUser.length; arrItemOn++) {
                if (arrUser[arrItem] == arrUser[arrItemOn]) {
                    flag += 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("没重复的");
        } else {
            System.out.println("有重复的");
        }
    }
}
