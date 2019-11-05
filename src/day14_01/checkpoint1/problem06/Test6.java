package day14_01.checkpoint1.problem06;

import day14_01.checkpoint1.problem06.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<>();
        hashMap.put("asd",new Student("aa",15));
        hashMap.put("rsf",new Student("bb",12));
        hashMap.put("das",new Student("cc",14));
        hashMap.put("asd",new Student("dd",11));
        Set<String> keys = hashMap.keySet();
        Iterator<String> it1 = keys.iterator();
        while (it1.hasNext()){
            String key = it1.next();
            Student value = hashMap.get(key);
            System.out.println(key + "->" + value.toString());
        }
        System.out.println("-----");
        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> it2 = entrySet.iterator();
        while (it2.hasNext()){
            Map.Entry<String, Student> entry = it2.next();
            System.out.println(entry.getKey()+ "->" +entry.getValue().toString());
        }
    }
}
