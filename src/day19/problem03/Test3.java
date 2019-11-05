package day19.problem03;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Program Files\\a.png"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\c.png")); ){
            int len;
            byte[] b = new byte[8*1024];
            while ((len = bis.read(b)) != -1) {
                bos.write(b,0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
