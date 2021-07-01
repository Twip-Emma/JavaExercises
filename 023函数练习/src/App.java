import java.util.Scanner;

public class App {

    static int jie_for(int n) {
        int i;
        int sum = 1;
        for (i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    static int jie_while(int n) {
        int i = 1;
        int sum = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }

    static int jie_do_while(int n) {
        int i = 1;
        int sum = 1;
        do {
            sum *= i;
            i++;
        } while (i <= n);
        return sum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("求阶乘，输入n：");
        Scanner scan = new Scanner(System.in);
        int userIn = scan.nextInt();
        scan.close();
        
        int userGet1 = jie_for(userIn);
        int userGet2 = jie_while(userIn);
        int userGet3 = jie_do_while(userIn);

        System.out.println(userGet1);
        System.out.println(userGet2);
        System.out.println(userGet3);
    }
}
