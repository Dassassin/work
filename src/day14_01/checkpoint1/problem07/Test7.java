package day14_01.checkpoint1.problem07;

import day14_01.checkpoint1.problem07.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();
        hashMap.put(new Student("aa",15),"asd");
        hashMap.put(new Student("bb",12),"rsf");
        hashMap.put(new Student("cc",14),"das");
        hashMap.put(new Student("dd",11),"asd");
        Set<Student> keys = hashMap.keySet();
        Iterator<Student> it1 = keys.iterator();
        while (it1.hasNext()){
            Student key = it1.next();
            String value = hashMap.get(key);
            System.out.println(key.toString() + "->" + value);
        }
        System.out.println("-----");
        Set<Map.Entry<Student, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Student, String>> it2 = entrySet.iterator();
        while (it2.hasNext()){
            Map.Entry<Student, String> entry = it2.next();
            System.out.println(entry.getKey().toString()+ "->" +entry.getValue());
        }
    }
}
