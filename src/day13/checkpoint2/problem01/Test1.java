package day13.checkpoint2.problem01;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('f');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('d');
        HashSet<Character> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}
