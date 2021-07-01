package com.example.javaweb.function;

//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Try2 {
    public void Start() {
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/sqltestdb";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "82991400";
        //遍历查询结果集
        System.out.println("1.显示数据库\n2.添加记录\n3.删除记录");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                ShowDataBase(driver,url,user,password);
                break;
            default:
                System.out.println("请输入正确的序号");
                Start();
                break;
        }
    
        //声明Connection对象
        Connection con;
        String msg = "{";
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from emp";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println("姓名" + "\t" + "职称");
            System.out.println("-----------------");

            String job;
            String id;

            int flag = 1;
            while (rs.next()) {
                if (flag == 0) {
                    msg += ",";
                }
                //获取stuname这列数据
                job = rs.getString("job");
                //获取stuid这列数据
                id = rs.getString("ename");

                //输出结果
                msg += "{姓名:" + id + ",工作:" + job + "}";
                System.out.println(id + "\t" + job);
                flag = 0;
            }
            msg += "}";
            rs.close();
            con.close();
            System.out.println(msg);
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
        }
        return msg;
    }
}
