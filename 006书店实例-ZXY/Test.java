package com.xxx.dome1;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        Student student =new Student();
        Teacher teacher= new Teacher();
        Student student1;
        Person person1;

        System.out.println("测试person");
        person.Sleep();
        person.eat();
        person.toString();

        System.out.println("测试student");
        student.Sleep();
        student.eat();
        student.study();
        student.toString();

        System.out.println("测试Teacher");
        teacher.Sleep();
        teacher.eat();
        teacher.tech();
        teacher.toString();

        System.out.println("Student向Person 的向上转型");
        person1=student;
        System.out.println(person1.hhhh);
        System.out.println("Person向 Student的向下转型");
        student1=(Student)person1;
        System.out.println(student1.hh);

    }
}