import java.util.Arrays;
public class App {
    static void ShowArr(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static void ArrPai(int array[])
    {
        for(int s=0;s<array.length/2;s++)
        {
            int temp;
            temp = array[s];
            array[s] = array[array.length-s-1];
            array[array.length-s-1] = temp;
        }
        ShowArr(array);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arrUser[]=new int[10];
        for(int item=0;item<arrUser.length;item++)
        {
            arrUser[item] = (int)(Math.random()*100);
        }
        System.out.println("原内容：");
        ShowArr(arrUser);
        System.out.println("对调后：");
        ArrPai(arrUser);
        Arrays.sort(arrUser);
        System.out.println("排序后：");
        ShowArr(arrUser);
        
    }
}
