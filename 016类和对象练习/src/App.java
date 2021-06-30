public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Phone phone1 = new Phone();
        phone1.about();
        phone1.call(3);
        phone1.playGame();
        phone1.playMusic("好汉歌");
        System.out.println("********************");

        Phone phone2 = new Phone("小米","小米6s","mi_9",4999,6);
        // 测试phone2 的各项功能
        phone2.about();
        phone2.call(4);
        phone2.playGame();
        phone2.playMusic("Without you");

    }
}
