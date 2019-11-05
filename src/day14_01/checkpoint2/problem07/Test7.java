package day14_01.checkpoint2.problem07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(strs[i])) {
                map.put(strs[i], 1);
            } else {
                Integer count = map.get(strs[i]);
                map.put(strs[i], ++count);
            }
        }
        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key+"="+map.get(key));
        }
    }
}
