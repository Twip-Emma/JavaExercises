public class Administrators {
    String user_id;

    public void admin_check(String user_id){
        String[] admin_user={"1157529280","10002"};
        boolean admin_flag = false;
        for(String x:admin_user){
            if(x.equals(user_id)){
                admin_flag = true;
            }
        }
        if(admin_flag){
            System.out.println("欢迎您，管理员");
        }else{
            System.out.println("欢迎您，普通用户");
        }
    }
}
