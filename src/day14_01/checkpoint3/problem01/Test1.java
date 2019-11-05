package day14_01.checkpoint3.problem01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> baseClass = new HashMap<>();
        HashMap<String,String> obtainEmploymentClass = new HashMap<>();
        baseClass.put("001","李晨");
        baseClass.put("002","范冰冰");
        obtainEmploymentClass.put("001","马云");
        obtainEmploymentClass.put("002","马化腾");
        Set<String> keys1 = baseClass.keySet();
        for (String key:keys1) {
            System.out.println(key+"="+baseClass.get(key));
        }
        System.out.println("-----");
        Set<String> keys2 = obtainEmploymentClass.keySet();
        for (String key:keys2) {
            System.out.println(key+"="+obtainEmploymentClass.get(key));
        }
        System.out.println("----------");
        Set<Map.Entry<String,String>> entrySet1 = baseClass.entrySet();
        Iterator<Map.Entry<String,String>> it1 = entrySet1.iterator();
        while (it1.hasNext()){
            String key = it1.next().getKey();
            System.out.println(key+"="+baseClass.get(key));
        }
        System.out.println("-----");
        Set<Map.Entry<String,String>> entrySet2 = obtainEmploymentClass.entrySet();
        Iterator<Map.Entry<String,String>> it2 = entrySet1.iterator();
        while (it2.hasNext()){
            String key = it2.next().getKey();
            System.out.println(key+"="+baseClass.get(key));
        }
    }
}
