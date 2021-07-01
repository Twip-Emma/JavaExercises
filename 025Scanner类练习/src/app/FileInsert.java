package app;

import java.io.*;
import java.util.Scanner;

public class FileInsert {
    public void Start(){
        File exp1 = new File("C:\\Users\\七画一只妖\\IdeaProjects\\JavaLearnScanner\\src\\app\\exp1-1.txt");
        try {
            //用Scanner类读取文件
            Scanner e1 = new Scanner(exp1);
            int LineNum = 0;
            String str = "";
            while(e1.hasNext()){
                LineNum++;
                String text=e1.nextLine();
                System.out.println(LineNum +"："+ text);
                str = str + LineNum +"："+ text + "\n";
            }
            //写入文件
            FileWriter exp2 = new FileWriter("C:\\Users\\七画一只妖\\IdeaProjects\\JavaLearnScanner\\src\\app\\exp1-2.txt");
            exp2.write(str);
            exp2.flush();
            exp2.close();

        }catch (FileNotFoundException e){
            System.out.println("找不到文件~");
        }catch (IOException e){
            System.out.println(e.toString());
        }


    }
}
