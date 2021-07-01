public class App {
    private static int num;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int number = 10;

        printInfo(number);
        
        number = number << 1;
        printInfo(number);

        number = number >> 1;
        printInfo(number);
    }
    private static void printInfo(int num) {
        App.num = num;
        System.out.println(App.num);
        System.out.println(Integer.toBinaryString(num));
    }
}
