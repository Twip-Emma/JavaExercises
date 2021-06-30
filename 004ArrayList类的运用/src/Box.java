public class Box {
    private int age;
    private String name;
    private int coin;

    public void getUserInfo(){
        this.age = 111;
        this.coin = 28000;
        this.name = "境神";
    }

    public void getUserInfo(int age, String name, int coin) {
        this.age = age;
        this.coin = coin;
        this.name = name;
    }

    public void showUserInfo() {
        String user_info = "你的昵称:" + name + "\n你的等级:" + age + "\n你的余额:" + coin;
        System.out.println(user_info);
    }
}
