package day13.checkpoint1.problem05;

import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("zhangsan");
        set.add( "lisi");
        set.add("wangwu");
        set.add("zhangsan");
        for (String name : set) {
            System.out.println(name);
        }
    }
}
