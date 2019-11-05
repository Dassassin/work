package day18.checkpoint1.problem05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            int len;
            byte[] b = new byte[5];
            while ((len = fis.read(b)) != -1){
                System.out.print(new String(b));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
