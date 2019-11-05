package day18.checkpoint3.problem01;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    private static int COUNT = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f1 = new File(s);
        File f2 = new File("D:\\java");
        statistics(f1,f2);
        System.out.println("共有"+COUNT+"个Java文件。");
    }

    private static void statistics(File file1,File file2) {
        File[] files = file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                statistics(f,file2);
            }else {
                String name = f.getName();
                File fileTemp = new File(file2.getAbsolutePath()+"\\"+name);
                for (File file : file2.listFiles()) {
                    if (name.equals(file.getName())) {
                        name = file2.getAbsolutePath()+"\\("+COUNT+")"+name;
                        fileTemp = new File(name);
                    }
                }
                try {
                    FileInputStream fis = new FileInputStream(f);
                    FileOutputStream fos = new FileOutputStream(fileTemp);
                    byte[] b = new byte[1024];
                    int len;
                    while ((len = fis.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }
                    COUNT++;
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
