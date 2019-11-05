package day18.checkpoint2.problem04;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("test.txt"));
            Set<String> strings = pro.stringPropertyNames();
            for (String key : strings ) {
                if (key.equals("lisi")){
                    pro.setProperty(key,"100");
                }
            }
            for (String key : strings ) {
                System.out.println(key+" -- "+pro.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
