package day13.checkpoint1.problem04;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("l1");
        link.add("l2");
        link.add("l3");
        System.out.println("原LinkedList："+link);
        link.addFirst("l4");
        System.out.println("添加元素后："+link);
        link.addLast("l5");
        System.out.println("添加元素后："+link);
        System.out.println("第一个元素："+link.getFirst());
        System.out.println("最后一个元素："+link.getLast());
        link.removeFirst();
        System.out.println("删除第一个元素后："+link);
        link.removeLast();
        System.out.println("删除最后一个元素后："+link);
    }
}
