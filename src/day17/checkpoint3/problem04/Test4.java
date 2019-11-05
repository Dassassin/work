package day17.checkpoint3.problem04;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        printF(f);
    }

    private static void printF(File f) {
        File[] files = f.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                System.out.println(file.getName());
                printF(file);
            }
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
