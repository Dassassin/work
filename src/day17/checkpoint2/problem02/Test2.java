package day17.checkpoint2.problem02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        if (f.exists()){
            System.out.println("文件已存在，大小为"+f.length());
        }else {
            f.createNewFile();
        }
        if (f.isDirectory()){
            File[] files = f.listFiles();
            long l = 0;
            for (File file : files) {
                System.out.println(file);
                l += file.length();
            }
            System.out.println("该文件夹下的文件总大小为"+ l);
        }
    }
}
