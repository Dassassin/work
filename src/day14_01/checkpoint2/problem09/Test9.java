package day14_01.checkpoint2.problem09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (map.size()<5){
            System.out.print("请输入入一本书的信息（格式：书名,价格）：");
            String str = sc.next();
            String strs[]=str.split(",");
            for (int i = 0; i < 1; i++){
                map.put(strs[i],strs[i+1]);
            }
        }
        map.remove("C++");
        map.put("Java","38.5");
        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-----");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
