package io;

import java.io.*;

public class IoTry {
    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("C:\\Users\\七画一只妖\\IdeaProjects\\期末复习\\src\\io\\a.txt");
        OutputStream os = new FileOutputStream("C:\\Users\\七画一只妖\\IdeaProjects\\期末复习\\src\\io\\b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes,0,len);
            os.flush();
        }
        is.close();
        os.close();
    }
}