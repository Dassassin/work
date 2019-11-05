package day14_01.checkpoint1.problem03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        hashMap.put(1,'a');
        hashMap.put(2,'c');
        hashMap.put(3,'b');
        hashMap.put(4,'e');
        Collection<Character> values = hashMap.values();
        for (char c:values) {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("-----");
        Iterator<Character> it = values.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
