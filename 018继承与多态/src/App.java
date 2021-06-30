public class App {
    public static void main(String[] args) throws Exception {

        // 基本测试一下类
        Person person = new Person();
        person.sleep();
        person.eat();
        Student student = new Student();
        student.sleep();
        student.eat();
        student.study();
        Teacher teacher = new Teacher();
        teacher.sleep();
        teacher.eat();
        teacher.tech();

        Student student1;
        Person person1;
        System.out.println("==================");
        // person向student向上转型
        person1 = student;
        person1.eat();
        // student向person向下转型
        student1 = (Student) person1;
        student1.eat();
    }
}
