package day17.checkpoint1.problem06;

import java.io.File;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\aaa\\b.txt");
        f.createNewFile();
        System.out.println("文件名："+f.getName());
        System.out.println("文件大小："+f.length());
        System.out.println("文件绝对路径："+f.getAbsolutePath());
        System.out.println("父路径："+f.getParent());
    }
}
