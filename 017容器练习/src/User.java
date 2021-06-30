//User.java
//import java.util.Set;
import java.util.HashSet;
public class User {
    //private int count;//目前投票数
    
    private static HashSet<User> users = new HashSet<User>();
    //private static HashSet<User> users;
    private String name;
    private String change;

    // public User(){
    //     users = new HashSet<User>();
    // }

    public void voterGet(String change){
        if(users.size() == 3){
            System.out.println("失败，投票总数已达3");
        }else if(users.contains(this)){
            //有这个投票了
            System.out.println(this.name +" 失败，不能重复投票");
        }else{
            //投票成功
            //count += 1;
            users.add(this);
            this.change = change;
            System.out.println(this.name+" 感谢你的投票");
        }        
    }

    public User(String name){
        this.name = name;
    }

    public void showUsersChange(){
        //遍历HashSet
        for(User item:users){
            String userName = item.name;
            String userChange = item.change;
            System.out.println(userName + " 意见 " + userChange);
        }
    }
}
