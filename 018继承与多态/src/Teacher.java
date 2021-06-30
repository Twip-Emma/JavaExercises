public class Teacher extends Person{
    public String tid;

    public void tech(){
        System.out.println("【Teacher】我在教书");
    }

    @Override
    public void eat(){
        System.out.println("【Teacher】我正在吃教师餐");
    }
}
