package exam02.problem03;

import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                countingKey(map, "字母");
            } else if (Character.isSpaceChar(c)) {
                countingKey(map, "空格");
            } else if (Character.isDigit(c)) {
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }
        System.out.println(map);
    }

    private static void countingKey(HashMap<String, Integer> map, String key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            Integer count = map.get(key);
            map.put(key, ++count);
        }
    }
}

