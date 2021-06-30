package bookstore;



/**
 * 客户信息类
 * @author 玖
 */
public class Client {
    private int number=0;
    private String name=null;
    private String phone=null;
    private double money=0;
    private int member=0;
    /*****构造方法存储客户信息;*****/
    public Client(int number,String name, String phone, double money,int member) {
        this.number=number;
        this.name = name;
        this.phone = phone;
        this.money = money;
        this.member=member;
    }
    /*****以字符串的形式返回客户信息*****/
    public String getPeople(){
        return("编号:"+this.number+"\n姓名:"+this.name+"\n电话:"+this.phone+"\n余额:"+this.money+"\n会员等级:"+member);
    }
    /*********设置客户信息***********/
    public void setPeople(int number,String name,String phone,double money,int member){
        this.number=number;
        this.name=name;
        this.phone=phone;
        this.money=money;
        this.member=member;
    }
    /********************设置会员等级*****************/
    protected void setMember(int member) {
        this.member = member;
    }
    /*****************获取会员等级*****/
    protected int getMember(){
        return member;
    }
    /************查看余额**********/
    protected int getMoney(){
        return number;
    }
    /**********金额减少*****/
    protected void sub_money(double mon){
        money-=mon;
    }
    /*********金额增加********/
    protected void add_money(double mon){
        money+=mon;
    }


}
