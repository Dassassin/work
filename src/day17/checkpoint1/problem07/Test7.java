package day17.checkpoint1.problem07;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        File f1 = new File("D:\\a.txt");
        File f2 = new File("D:\\aaa");
        panDuan(f1);
        panDuan(f2);
    }

    private static void panDuan(File f) {
        if (f.isFile()){
            System.out.println(f.getName()+"是一个文件");
        }else {
            System.out.println(f.getName()+"不是一个文件");
        }
        if (f.isDirectory()){
            System.out.println(f.getName()+"是一个文件夹");
        }else {
            System.out.println(f.getName()+"不是一个文件夹");
        }
    }
}
