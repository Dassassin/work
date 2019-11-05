package day18.checkpoint1.problem04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            int b;
            while ((b = fis.read()) != -1){
                System.out.print((char)b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
