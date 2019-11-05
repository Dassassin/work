package day18.checkpoint2.problem01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        String s = null;
        System.out.println("请输入学生信息（格式：学号-学生姓名）：");
        try {
            FileOutputStream fos = new FileOutputStream(f,true);
            while (!("end".equals(s))){
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
