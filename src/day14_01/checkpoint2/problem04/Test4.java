package day14_01.checkpoint2.problem04;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        Set<Character> keys = map.keySet();
        for (char key:keys) {
            System.out.print(key+"("+map.get(key)+")");
        }
    }
}
