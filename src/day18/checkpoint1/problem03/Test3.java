package day18.checkpoint1.problem03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f,true);
            byte[] b1 = "i love java".getBytes();
            byte[] b2 = "\r\n".getBytes();
            for (int i = 0; i < 5; i++) {
                fos.write(b1);
                fos.write(b2);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
