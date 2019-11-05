package day19.problem01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f))) {
            byte b = 1;
            bos.write(b);
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
