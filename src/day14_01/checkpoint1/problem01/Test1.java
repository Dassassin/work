package day14_01.checkpoint1.problem01;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"aa");
        hashMap.put(3,"bb");
        hashMap.put(2,"cc");
        hashMap.put(4,"dd");
        System.out.println(hashMap);
        hashMap.put(2,"ccc");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.remove(4));
        System.out.println(hashMap);
    }
}
