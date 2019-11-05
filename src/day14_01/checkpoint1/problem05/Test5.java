package day14_01.checkpoint1.problem05;

import java.util.HashMap;
import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("邓超","孙俪");
        hashMap.put("李晨","范冰冰");
        hashMap.put("刘德华","柳岩");
        hashMap.put("黄晓明","Baby");
        hashMap.put("谢霆锋","张柏芝");
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+ "->" +entry.getValue());
        }
    }
}
