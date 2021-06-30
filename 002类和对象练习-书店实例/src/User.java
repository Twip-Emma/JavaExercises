public class User {
    String user_id;
    String user_name;

    public String find_user(String user_id) {
        //String user_name;
        String[][] user_id_info = {
            { "1157529280", "七画一只妖" },
            { "10001", "张三" },
            { "10002", "Twip" } 
        };
        for (String x[] : user_id_info) {
            //System.out.println(x[0]);
            if (x[0].equals(user_id)) {
                //System.out.println(x[1]);
                user_name = x[1];
            }

        }
        return user_name;
        // System.out.println(user_id_info[1][1]);
    }

    public Result find_user_info(String user_id){
        Result result = new Result();
        Object[][] user_id_info = {
            {"1157529280","88888888",1200},
            {"10001","123456678",25},
            {"10002","987654321",864}
        };
        for (Object x[]:user_id_info){
            if(x[0].equals(user_id)){
                result.user_phone_r = (String)x[1];
                result.user_coin_r = (int)x[2];
            }
        }
        return result;
    }
    public int user_level(String user_id){
        int level = 0;
        Object[][] user_level_info = {
            { "1157529280", 1 },
            { "10001", 0 },
            { "10002", 3 } 
        };
        for (Object x[]:user_level_info){
            if(x[0].equals(user_id)){
                level = (int)x[1];
            }
        }
        return level;
    }

}
class Result {
    String user_phone_r;
    int user_coin_r;
 
    // 构造函数
    public Result() {
        super();
    }
}
