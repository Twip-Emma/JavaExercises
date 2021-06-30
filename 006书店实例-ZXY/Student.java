package com.xxx.dome1;

public class Student extends Person{

    private String sno="sno";
    public String hh="我是student";
    public void study(){
        System.out.println("Student 的Sno方法运行了");
    }

    @Override
    public void Sleep(){
        System.out.println("Student 的Sleep方法运行了");
    }

    @Override
    public void eat(){
        System.out.println("Student 的eat方法运行了");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ",name='" + name + '\'' +
                ",age='" + age + '\'' +
                ",sno='" + sno + '\'' +
                '}';
    }
}