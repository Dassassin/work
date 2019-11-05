package day18.checkpoint1.problem02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte[] b = "东方标准".getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
