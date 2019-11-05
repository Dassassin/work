package day18.checkpoint1.problem07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Program Files\\a.png");
            FileOutputStream fos = new FileOutputStream("D:\\a.png");
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0 , len);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
