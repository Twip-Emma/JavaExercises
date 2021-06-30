import java.util.Scanner;

public class BookBuy {
    BookInfo books = new BookInfo();
    // books.show_book_items();
    int[] user_buy;
    int[] price;
    int prize_total = 0;

    public void get_user_buy(String user_id) {
        System.out.println("输入你想购买书的数量");
        Scanner sc = new Scanner(System.in);//？
        int book_buy_count = sc.nextInt();
        user_buy = new int[book_buy_count];
        System.out.println("发送每本书的ID,每按一次回车为一次记录");
        for (int i = 0; i < book_buy_count; i++) {
            int user_buy_item = sc.nextInt();
            user_buy[i] = user_buy_item;
        }
        get_user_buy_book_info(user_buy,user_id);
    }

    private void get_user_buy_book_info(int user_buy[],String user_id) {
        Object[][] book_items = { { "新手起步指南", 45, "蔷薇骑士", "冒险家协会出版社", 1 }, { "魔力概论", 60, "蔷薇骑士", "冒险家协会出版社", 2 },
                { "画中境历史", 50, "七画", "空域出版社", 3 }, { "恶魔的自我修养", 120, "七画", "空域出版社", 4 },
                { "大贤者必会500题", 100, "伊雷娜", "魔法师协会", 5 }, { "十二神面试模拟题", 350, "伊雷娜", "魔法师协会", 6 },
                { "非碳基生物进化论", 125, "鬼面公主", "历史研究协会", 7 }, { "墓地文明的毁灭", 175, "鬼面公主", "历史研究协会", 8 } };
        price = new int[user_buy.length];
        for (int i = 0; i < user_buy.length; i++) {
            for (int j = 0; j < book_items.length; j++) {
                // price = new int[user_buy.length];
                if ((int) book_items[j][4] == user_buy[i]) {
                    price[i] = (int) book_items[j][1];
                }
            }
        }
        sum_price_total(price,user_id);
    }

    private void sum_price_total(int price[],String user_id) {
        for (int i = 0; i < price.length; i++) {
            prize_total += price[i];
        }
        System.out.println("总价为" + prize_total);
        System.out.println("再次输入您的通行证以确定");
        // Scanner sc = new Scanner(System.in);
        // // int xxx = sc.nextInt();
        // String user_id = sc.nextLine();
        // sc.close();
        User user = new User();
        int user_level = user.user_level(user_id);
        if (user_level == 0) {
            System.out.println("您是普通用户，不打折");
        } else if (user_level == 1) {
            System.out.println("您是青铜用户，打8.5折");
            System.out.println("折后价为" + prize_total * 0.85);
        } else if (user_level == 2) {
            System.out.println("您是白银用户，打7.5折");
            System.out.println("折后价为" + prize_total * 0.75);
        } else if (user_level == 3) {
            System.out.println("您是黄金用户，打6折");
            System.out.println("折后价为" + prize_total * 0.6);
        }
        System.out.println("感谢您的购买");
    }
}
