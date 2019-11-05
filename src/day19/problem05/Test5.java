package day19.problem05;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        String FileName = "a.txt";
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName),"GBK");
            osw.write("我爱Java");
            osw.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
