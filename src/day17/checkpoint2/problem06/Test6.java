package day17.checkpoint2.problem06;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        long l = calculate(f);
        System.out.println("该文件夹的大小为"+l);
    }

    private static long calculate(File f) {
        long size = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            }else {
                calculate(file);
            }
        }
        return size;
    }
}
