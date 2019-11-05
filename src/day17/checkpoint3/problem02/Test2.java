package day17.checkpoint3.problem02;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        deleteDirectory(f);
    }

    private static void deleteDirectory(File f) {
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        for (File file : files) {
            if(file.listFiles()==null){
                file.delete();
            }else {
                deleteDirectory(file);
            }
            file.delete();
        }
    }
}
