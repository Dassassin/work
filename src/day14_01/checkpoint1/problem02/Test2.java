package day14_01.checkpoint1.problem02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        hashMap.put(1,'a');
        hashMap.put(2,'c');
        hashMap.put(3,'b');
        hashMap.put(4,'e');
        Set<Integer> keys = hashMap.keySet();
        for (Integer i:keys) {
            char c = hashMap.get(i);
            System.out.println(i+"-"+c);
        }
        System.out.println("-----");
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            int i = it.next();
            char c = hashMap.get(i);
            System.out.println(i+"-"+c);
        }
    }
}
