package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Arrays;

public class Stream {
    public static void main(String[] args)throws IOException
    {
        FileInputStream is=null;
        FileOutputStream os=null;
        try {
            System.out.println("请输入字符");
            File myfile = new File("C:\\Users\\七画一只妖\\IdeaProjects\\期末复习\\src\\io\\b.txt");
            Scanner sc=new Scanner(System.in);
            String input = sc.nextLine();
//            byte[] bytes = input.getBytes();
            byte[] bytes =new byte[100];
            Arrays.sort(bytes);

            os = new FileOutputStream(myfile);
            os.write(bytes,0,input.length());
//            os.flush();

            is = new FileInputStream(myfile);
            byte[] show = new byte[input.length()];
            is.read(show);
            System.out.println(new String(show));
        }finally {
            is.close();
            os.close();
        }
    }
}
