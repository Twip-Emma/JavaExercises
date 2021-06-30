import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("输入通行证：");
        Scanner sc = new Scanner(System.in);
        String user_id = sc.nextLine();

        //预加载
        User user1 = new User();
        Administrators user_check = new Administrators();
        BookInfo books = new BookInfo();
        user_check.admin_check(user_id);
        String user_name = user1.find_user(user_id);
        System.out.println("你的用户名是：" + user_name);
        while (true) {
            System.out.print("输入你想进行的操作\n1：查看个人信息\n2：查看书单\n3：充值\n4：买书\n5：退出");
            int user_change = sc.nextInt();
            if (user_change == 1) {
                Result result = new Result();
                result = user1.find_user_info(user_id);
                String user_phone = result.user_phone_r;
                int user_coin = result.user_coin_r;
                System.out.println("你的电话号码是：\n" + user_phone + "你的余额是：" + user_coin);
            } else if (user_change == 2) {
                books.show_book_items();
            } else if (user_change == 3) {
                int user_use_coin = sc.nextInt();
                Coin user_in_coin = new Coin();
                user_in_coin.coin_r(user_use_coin, user_id);
            } else if (user_change == 4) {
                BookBuy buy = new BookBuy();
                buy.get_user_buy(user_id);
            } else {
                break;
            }
        }
        sc.close();
    }
}
