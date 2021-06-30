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
    protected double getMoney(){
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "顾客信息：{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                ", member=" + member +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        return this.number==((Client)obj).number;
    }

    @Override
    public int hashCode(){
        return 100+this.number;
    }

}