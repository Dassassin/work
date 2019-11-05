package day12.checkpoint1.problem01;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll);
        System.out.println("判断a是否在集合中："+coll.contains("a"));
        System.out.println("删除a："+coll.remove("a"));
        System.out.println("操作之后集合中元素："+coll);
        System.out.println("集合中有"+coll.size()+"个元素");
        coll.clear();
        System.out.println("集合中内容为："+coll);
    }
}
