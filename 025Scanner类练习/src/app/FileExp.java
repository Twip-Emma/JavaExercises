package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExp {

    public void Start() {
        try{
            System.out.println("输入你想保存到文件里面的字段");
    //        Scanner input = new Scanner(System.in);
    //        String str = input.nextLine();
            //不用绝对路径不会写入文件，不过后来发现不是绝对路径的问题，是因为没有刷新
            File file = new File("C:\\Users\\七画一只妖\\IdeaProjects\\JavaLearnScanner\\src\\app\\exp.txt");

            //写入文件
            byte[] show = new byte[100];
            int bytes = System.in.read(show,0,100);
            FileOutputStream fos = new FileOutputStream(file,false);
            fos.write(show,0,bytes);

            //读取文件
            byte[] write = new byte[bytes];
            FileInputStream fis = new FileInputStream(file);
            fis.read(write);
            System.out.println(new String(write));
//            System.out.println(write);
        }

        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
