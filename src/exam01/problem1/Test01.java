package exam01.problem1;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');
        System.out.print("原数组：");
        for (char c:chars) {
            System.out.print(c);
        }
        System.out.println();
        Collections.reverse(chars);
        System.out.print("翻转后：");
        for (char c:chars) {
            System.out.print(c);
        }

    }
}
