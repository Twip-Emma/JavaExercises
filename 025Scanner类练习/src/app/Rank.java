package app;

import java.util.Arrays;
import java.util.Scanner;

public class Rank {
    static int arr[] = new int[10];

    public void Start() {
        System.out.println("依次输入10个数字，每个数字输入完毕按下回车");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int item = input.nextInt();
            arr[i] = item;
        }
        input.close();
        //排序
        Arrays.sort(arr);
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + ",");
        }
    }
}
