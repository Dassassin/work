package day18.checkpoint1.problem06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tset6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Program Files\\a.png");
            FileOutputStream fos = new FileOutputStream("D:\\a.png");
            int b;
            while (((b = fis.read()) != -1)) {
                fos.write(b);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
