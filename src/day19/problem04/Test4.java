package day19.problem04;

import java.io.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入验证码：");
        Scanner sc = new Scanner(System.in);
        File f = new File("data.txt");
        String s = sc.nextLine();
        String out = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = null;
            while ((line = br.readLine()) != null){
                if (s.equals(line)){
                    out = "验证成功";
                    break;
                } else {
                    out = "验证失败";
                }
            }
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
