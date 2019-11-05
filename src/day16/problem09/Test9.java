package day16.problem09;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(4);
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(2);
        set.add(4);
        map.put(1,1);
        map.put(2,5);
        map.put(3,6);
        map.put(4,2);
        map.put(5,4);
        System.out.println("遍历List");
        list.forEach(System.out::println);
        System.out.println("遍历Set");
        set.forEach(System.out::println);
        System.out.println("遍历Map");
        map.entrySet().forEach(System.out::println);
    }
}
