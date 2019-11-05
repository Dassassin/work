package day17.checkpoint2.problem04;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\admin\\Desktop\\work");
        printDir(dir);
    }

    private static void printDir(File dir) {
        FileFilterImpl ffi = new FileFilterImpl();
        File[] files = dir.listFiles(ffi);
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            }else {
                printDir(file);
            }
        }
    }
}
