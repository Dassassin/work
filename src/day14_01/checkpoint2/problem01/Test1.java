package day14_01.checkpoint2.problem01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (hashMap.size()<5){
            System.out.print("输入学生信息（格式：姓名,年龄）：");
            String str = sc.next();
            String strs[]=str.split(",");
            for (int i = 0; i < 1; i++){
                hashMap.put(strs[i],strs[i+1]);
            }
        }
        Set<String> keys = hashMap.keySet();
        for (String key:keys) {
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }
    }
}
