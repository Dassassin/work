package day19.problem06;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        String FileName = "a.txt";
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName),"GBK");
            int read;
            while ((read = isr.read()) != -1) {
                System.out.print((char)read);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
