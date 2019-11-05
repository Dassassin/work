package day17.checkpoint2.problem03;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\admin\\Desktop\\work");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();
        if (files==null ) {
            System.out.println("文件夹下无目录（空）!");
        } else {
            for (File file : files) { // 判断
                if (file.isFile()) {
                    System.out.println("文件名:" + file.getAbsolutePath());
                } else {
                    System.out.println("目录:" + file.getAbsolutePath());
                    printDir(file);
                }
            }
        }
    }
}
