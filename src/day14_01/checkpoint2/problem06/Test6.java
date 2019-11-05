package day14_01.checkpoint2.problem06;

import java.util.ArrayList;
import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> map = new HashMap<>();
        for (String str:list) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    Integer count = map.get(c);
                    map.put(c, ++count);
                }
            }
        }
        System.out.println(map);
    }
}
