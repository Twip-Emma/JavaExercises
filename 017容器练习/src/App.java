//App.java
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //User users = new User();

        //1
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");
        User user4 = new User("老六");
        //voterGet
        user1.voterGet("是");

        user2.voterGet("是");
        user2.voterGet("是");
        user2.voterGet("否");

        user3.voterGet("否");
        user4.voterGet("否");
        //遍历
        user1.showUsersChange();
    }
}
