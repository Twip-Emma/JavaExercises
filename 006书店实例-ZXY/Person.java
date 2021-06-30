package com.xxx.dome1;

public class Person {

    public String id="id";
    public String name="name";
    public String age="age";
    public String hhhh="我是person";
    public void Sleep(){
        System.out.println("Person的Sleep方法运行了");
    }
    public void eat(){
        System.out.println("Person的eat方法运行了");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}