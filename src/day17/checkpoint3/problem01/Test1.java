package day17.checkpoint3.problem01;

import java.io.File;
import java.io.FileFilter;

public class Test1 {
    public static void main(String[] args) {
        File dir = new File("D:\\Program Files");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().length()<200000||pathname.isDirectory();
            }
        });
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getName());
            }else {
                printDir(file);
            }
        }
    }
}
