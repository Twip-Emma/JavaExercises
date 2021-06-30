public class Coin {
    int coin;
    User user = new User();

    public void coin_r(int get_coin, String user_id) {
        int user_level = user.user_level(user_id);
        this.coin = get_coin;
        if (coin < 200) {
            coinLEVLE0(coin, user_level);
        } else if (coin < 500) {
            coinLEVLE1(coin, user_level);
        } else if (coin < 800) {
            coinLEVLE2(coin, user_level);
        } else {
            coinLEVLE3(coin, user_level);
        }
    }

    private void coinLEVLE0(int coin, int user_level) {
        System.out.println("你充值了：" + coin + "元");
    }

    private void coinLEVLE1(int coin, int user_level) {
        System.out.println("你充值了：" + coin + "元");
        if (user_level < 1) {
            System.out.println("恭喜你，你变成了青铜用户");
        }
    }

    private void coinLEVLE2(int coin, int user_level) {
        System.out.println("你充值了：" + coin + "元");
        if (user_level < 2) {
            System.out.println("恭喜你，你变成了白银用户");
        }
    }

    private void coinLEVLE3(int coin, int user_level) {
        System.out.println("你充值了：" + coin + "元");
        if (user_level < 3) {
            System.out.println("恭喜你，你变成了黄金用户");
        }
    }
}
