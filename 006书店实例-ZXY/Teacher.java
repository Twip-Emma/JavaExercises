package com.xxx.dome1;

public class Teacher extends Person{

    private String tid="tid";

    public void tech() {
        System.out.println("Teacher的tech方法运行了");
    }

    @Override
    public void Sleep(){
        System.out.println("Teacher 的Sleep方法运行了");
    }

    @Override
    public void eat(){
        System.out.println("Teacher 的eat方法运行了");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ",name='" + name + '\'' +
                ",age='" + age + '\'' +
                ",tid='" + tid + '\'' +
                '}';
    }
}