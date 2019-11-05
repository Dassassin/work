package day17.checkpoint2.problem01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        if (f.exists()){
            System.out.println("文件已存在，大小为"+f.length());
        }else {
            f.createNewFile();
        }
    }
}
