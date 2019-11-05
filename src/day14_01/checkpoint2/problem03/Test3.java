package day14_01.checkpoint2.problem03;

import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"张三丰");
        hashMap.put(2,"周芷若");
        hashMap.put(3,"汪峰");
        hashMap.put(4,"灭绝师太");
        Set<Integer> keys1 = hashMap.keySet();
        for (int key:keys1) {
            String value = hashMap.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----");
        hashMap.put(5,"李晓红");
        hashMap.remove(1);
        hashMap.put(2,"周林");
        Set<Integer> keys2 = hashMap.keySet();
        for (int key:keys2) {
            String value = hashMap.get(key);
            System.out.println(key+"="+value);
        }
    }
}
