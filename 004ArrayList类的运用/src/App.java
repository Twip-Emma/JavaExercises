import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Box> users = new ArrayList<Box>();
        Box user1 = new Box();
        Box user2 = new Box();
        Box user3 = new Box();
        Box user4 = new Box();
        user1.getUserInfo(15, "张三", 650);
        user2.getUserInfo(18, "小李", 150);
        user3.getUserInfo(21, "摇摆哥", 1200);
        user4.getUserInfo(25, "老八", 888);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.add(new Box());

        Box user_info = new Box();
        for (int i = 0; i < users.size(); i++) {
            user_info = users.get(i);
            user_info.showUserInfo();
        }
    }
    
}