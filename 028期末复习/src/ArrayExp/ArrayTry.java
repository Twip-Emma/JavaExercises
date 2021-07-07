package ArrayExp;


import java.util.Arrays;

public class ArrayTry {
    private int[] arr = {1, 5, 9, 3, 8, 4, 7};
    int $asdhakjh_adhka = 1;
    public void start() {
        System.out.print("输出原内容：");
        display(arr);
        Arrays.sort(arr);
        System.out.print("排序后内容");
        display(arr);
        System.out.print("fill后内容");
        Arrays.fill(arr,0,2,999);
        display(arr);
        System.out.print("'7'的下标是：");
        int index = Arrays.binarySearch(arr,7);
        System.out.println(index);
    }

    private void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"/");
        }
        System.out.println();
    }
}
