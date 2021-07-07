package io;

import java.io.*;

public class StringMine {
    public static void main(String[] args) throws IOException {
        System.out.println("输入你想保存的字段");
        File myfile = new File("C:\\Users\\七画一只妖\\IdeaProjects\\期末复习\\src\\io\\b.txt");
        //写文件
        byte[] bytes = new byte[100];
        int len = System.in.read(bytes,0,100);
        OutputStream fos = new FileOutputStream(myfile,false);
        fos.write(bytes,0,len);
        //读文件
        byte[] showbytes = new byte[len];
        InputStream is = new FileInputStream(myfile);
        is.read(showbytes);
        System.out.println(new String(showbytes));
//        float a= 45.0;
//        char a= 75;
//        char a= 75;
    }
}
