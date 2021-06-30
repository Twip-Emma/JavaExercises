public class Student extends Person {
    public String sno;

    public void study(){
        System.out.println("【Student】我在学习");
    }

    @Override
    public void eat(){
        System.out.println("【Student】我正在吃学生餐");
    }
}
