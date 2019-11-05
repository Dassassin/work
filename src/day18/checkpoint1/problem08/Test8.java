package day18.checkpoint1.problem08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        String s = null;
        System.out.println("请输入数据：");
        try {
            FileOutputStream fos = new FileOutputStream(f,true);
            while (!("886".equals(s))){
                Scanner sc = new Scanner(System.in);
                s = sc.nextLine();
                byte[] b = s.getBytes();
                fos.write(b);
                fos.write("\n".getBytes());
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
