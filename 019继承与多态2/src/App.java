public class App {
    public static void main(String[] args) throws Exception {
        // 抽象类 多态现象
        Printer user1 = new LaserPrinter();
        user1.print();
        Printer user2 = new InkPrinter();
        user2.print();
    }
}
