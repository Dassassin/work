package day13.checkpoint2.problem09;

import java.util.ArrayList;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Character> array1 = new ArrayList<>();
        array1.add('a');
        array1.add('b');
        array1.add('a');
        array1.add('c');
        array1.add('d');
        ArrayList<Character> array2 = new ArrayList<>();
        array2.add('e');
        array2.add('f');
        array2.add('a');
        array2.add('d');
        array2.add('g');
        HashSet<Character> set = new HashSet<>();
        for (char c:array1){
            set.add(c);
        }
        for (char c:array2){
            set.add(c);
        }
        for (char c:set) {
            System.out.print(c+" ");
        }
    }
}
