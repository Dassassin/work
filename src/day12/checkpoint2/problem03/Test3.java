package day12.checkpoint2.problem03;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");
        System.out.println(frequency(list,"a"));
    }

    public static int frequency(ArrayList<String> arr, String key){
        int count = 0;
        for (String s:arr){
            if (s == key){
                count++;
            }
        }
        return count;
    }
}
