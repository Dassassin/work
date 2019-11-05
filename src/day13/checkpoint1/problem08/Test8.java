package day13.checkpoint1.problem08;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String s:set) {
            System.out.println(s);
        }
    }
}
