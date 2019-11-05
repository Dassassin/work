package day12.checkpoint1.problem05;

import java.util.ArrayList;
import java.util.Collection;

public class Test5 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("xiaomi");
        coll.add("xiaomi2");
        coll.add("xiaomi3");
        coll.add("xiaomi4");
        for(String s :coll){
            System.out.println(s);
        }
    }
}
