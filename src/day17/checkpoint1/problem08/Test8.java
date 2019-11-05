package day17.checkpoint1.problem08;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\admin\\Desktop\\work");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
