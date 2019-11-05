package day18.ex.Test;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Public\\Nwt\\cache\\recv");
        copyZipFile(file);
    }

    private static void copyZipFile(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".zip")||pathname.getName().endsWith(".rar")||pathname.isDirectory();
            }
        });
        for (File f:files) {
            if (f.isFile()){
                try {
                    FileInputStream fis = new FileInputStream(f);
                    FileOutputStream fos = new FileOutputStream("D:\\");//此处可以用控制台输入决定输出路径
                    int len;
                    byte[] b = new byte[1024];
                    while ((len = fis.read(b)) != -1){
                        fos.write(b,0, len);
                    }
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                copyZipFile(f);
            }
        }
    }
}
