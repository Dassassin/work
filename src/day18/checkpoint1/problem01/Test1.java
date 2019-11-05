package day18.checkpoint1.problem01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
