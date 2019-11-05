package day18.checkpoint2.problem02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        copyFile(f);
    }

    private static void copyFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                try {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream("D:\\asd\\"+file.getName());
                    byte[] b = new byte[1024];
                    int len;
                    while ((len = fis.read(b)) != -1) {
                        fos.write(b,0, len);
                    }
                    fos.close();
                    fis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }else {
                copyFile(file);
            }
        }

    }
}
