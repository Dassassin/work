package day21.problem09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Test9 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        File fils = new File("C:\\Users\\admin\\Desktop\\work\\src\\count.properties");
        if(!fils.exists())
        {
            fils.createNewFile();
        }
        FileInputStream fis = new FileInputStream(fils);
        prop.load(fis);
        int count = 0;
        String value = prop.getProperty("count");

        if(value!=null)
        {
            count = Integer.parseInt(value);
            count++;
            if(count>3)
            {
                System.out.println("程序使用次数已满，请续费");
                return;
            }else {
                System.out.println("程序已使用"+count+"次");
            }
        }
        prop.setProperty("count",count+"");
        FileOutputStream fos = new FileOutputStream(fils);

        prop.store(fos,"");

        fos.close();
        fis.close();
    }
}
